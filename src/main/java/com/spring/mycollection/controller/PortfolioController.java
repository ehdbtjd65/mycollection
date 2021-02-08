package com.spring.mycollection.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mycollection.domain.PortfolioBoardVO;
import com.spring.mycollection.service.PortfolioBoardService;
import com.spring.mycollection.util.PDFutil;

@Controller
@RequestMapping(value = "/portfolio")
public class PortfolioController {
	private static final Logger logger = LoggerFactory.getLogger(PortfolioController.class);

	@Resource(name = "profileuploadPath")
	private String profileuploadPath;

	@Autowired
	private PortfolioBoardService portfolioBoardService;

	
	
	// Get 으로 마이 포트 폴리오 접근
	@RequestMapping(value = "/myportfoliolist", method = RequestMethod.GET)
	public void portfoliolist(Model model, HttpServletRequest req, HttpSession session) {
		// String sessionHomeId = (String) session.getAttribute("homeId");

		String sessionHomeId = "do0610";
	
		PortfolioBoardVO vo= portfolioBoardService.read(sessionHomeId);
		
		logger.info(vo.getUser_id() +"     /home id ");
		model.addAttribute("vo",vo);
		model.addAttribute("portfoliolist", sessionHomeId);

	}

	// Get 으로 접근
	// ================ 포트폴리오 작성
	@RequestMapping(value = "/portfolio-register", method = RequestMethod.GET)
	public void portfolioinsert(Model model) {
		logger.info("/portfolio-register - 접근");
	}

	@RequestMapping(value = "/portfolio-register", method = RequestMethod.POST)
	public String portfolioinsert(PortfolioBoardVO vo, MultipartFile file, HttpServletRequest req, Model model)
			throws IOException {
		
		
		// HttpSession session = req.getSession();

		
		PortfolioBoardVO Pf_VO = new PortfolioBoardVO();
		PDFutil pdf = new PDFutil();
		logger.info("register2");
		if (file != null) {
			logger.info("originalName:" + file.getOriginalFilename());
			logger.info("size:" + file.getSize());
			logger.info("ContentType:" + file.getContentType());
		}
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		int count = pdf.saveUploadedFile("C:/mycollection/mycollection/src/main/file/PdfRoute/" + savedName);

		
		logger.info("컨트롤러로 넘어온 count 값   :   " + count );
		
	
		
		Pf_VO.setUser_id("do0610");
		Pf_VO.setPortfolio_url(profileuploadPath+savedName);
		Pf_VO.setPortfolio_page_count(count);
		
		int win = portfolioBoardService.create(Pf_VO);
		
		if(win == 1 ) {
			logger.info("성공 " );
		}
		return "redirect:/portfolio/myportfoliolist";

	}

	// 업로드된 파일을 저장하는 함수
	private String uploadFile(String originalName, byte[] fileDate) throws IOException {

		UUID uid = UUID.randomUUID();
		logger.info("uploadFile");

		String savedName = uid.toString() + "_" + originalName;
		logger.info("uploadFile saveName" + savedName);
		File target = new File(profileuploadPath, savedName);

		// org.springframework.util 패키지의 FileCopyUtils는 파일 데이터를 파일로 처리하거나, 복사하는 등의 기능이
		// 있다.
		FileCopyUtils.copy(fileDate, target);

		return savedName;

	}
}
