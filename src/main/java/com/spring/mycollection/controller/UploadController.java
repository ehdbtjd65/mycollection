package com.spring.mycollection.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mycollection.util.UploadFileUtils;
import com.spring.mycollection.util.MediaUtil;

@Controller
@RequestMapping("/sample/upload/*")
public class UploadController {
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

	@Resource(name = "uploadPath")
	private String uploadPath;

	@RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
	public String uploadFormGET() {
		return "/sample/upload/uploadForm";
	}

	// Post ��� ���� ���ε�
	@RequestMapping(value = "/uploadForm", method = RequestMethod.POST)
	public String uploadFormPOST(MultipartFile file, Model model) throws Exception {

		logger.info("uploadFormPost");

		if (file != null) {
			logger.info("originalName:" + file.getOriginalFilename());
			logger.info("size:" + file.getSize());
			logger.info("ContentType:" + file.getContentType());
		}

		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());

		model.addAttribute("savedName", savedName);
//		UploadFileUtils.uploadFile(savedName, file.getOriginalFilename(), file.getBytes());

		return "/sample/upload/uploadForm";
	}

	// ���ε�� ������ �����ϴ� �Լ�
	private String uploadFile(String originalName, byte[] fileDate) throws IOException {

		UUID uid = UUID.randomUUID();
		logger.info("uploadFile");

		String savedName = uid.toString() + "_" + originalName;
		logger.info("uploadFile saveName" + savedName);
		File target = new File(uploadPath, savedName);

		// org.springframework.util ��Ű���� FileCopyUtils�� ���� �����͸� ���Ϸ� ó���ϰų�, �����ϴ� ���� �����
		// �ִ�.
		FileCopyUtils.copy(fileDate, target);

		return savedName;

	}

	// Ajax ���� ���ε�
	@RequestMapping(value = "/sample/upload/uploadAjax", method = RequestMethod.GET)

	public String uploadAjaxGET() {
		return "/sample/upload/uploadAjax";
	}

	// Ajax ���� ���ε� produces�� �ѱ�� ���������� �����ϱ� ���� �Ӽ�
	@ResponseBody
	@RequestMapping(value = "/sample/upload/uploadAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")

	public ResponseEntity<String> uploadAjaxPOST(MultipartFile file) throws Exception {

		logger.info("originalName:" + file.getOriginalFilename());
		logger.info("size:" + file.getSize());
		logger.info("contentType:" + file.getContentType());

		// String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());

		// HttpStatus.CREATED : ���ҽ��� ���������� �����Ǿ��ٴ� �����ڵ�.
//		return new ResponseEntity<>(file.getOriginalFilename(), HttpStatus.CREATED);
		return new ResponseEntity<>(UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes()),
				HttpStatus.CREATED);
	}

	// ȭ�鿡 ����� ������ �����ִ� ��Ʈ�ѷ� /��/��/��/���ϸ� ���·� �Է� �޴´�.
	// displayFile?fileName=/��/��/��/���ϸ�

	@ResponseBody
	@RequestMapping(value = "/sample/upload/displayFile", method = RequestMethod.GET)

	public ResponseEntity<byte[]> displayFile(String fileName) throws Exception {

		InputStream in = null;
		ResponseEntity<byte[]> entity = null;

		logger.info("File name: " + fileName);

		try {
			String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);

			MediaType mType = MediaUtil.getMediaType(formatName);

			HttpHeaders headers = new HttpHeaders();

			in = new FileInputStream(uploadPath + fileName);

			if (mType != null) {
				headers.setContentType(mType);
			} else {
				fileName = fileName.substring(fileName.indexOf("_") + 1);
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.add("Content-Disposition",
						"attachment; filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");
			} // else

			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}

		return entity;
	}// displayFile

	// ���ε�� ���� ���� ó��

	@ResponseBody
	@RequestMapping(value = "/sample/upload/deleteFile", method = RequestMethod.POST)

	public ResponseEntity<String> deleteFile(String fileName) throws Exception {

		logger.info("delete file:" + fileName);

		String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);

		MediaType mType = MediaUtil.getMediaType(formatName);

		if (mType != null) {
			String front = fileName.substring(0, 12);
			String end = fileName.substring(14);
			new File(uploadPath + (front + end).replace('/', File.separatorChar)).delete();
		} // if

		new File(uploadPath + fileName.replace('/', File.separatorChar)).delete();

		return new ResponseEntity<String>("deleted", HttpStatus.OK);

	}
}
