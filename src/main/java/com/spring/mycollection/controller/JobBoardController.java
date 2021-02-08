package com.spring.mycollection.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mycollection.domain.JobBoardVO;
import com.spring.mycollection.service.JobBoardService;
import com.spring.mycollection.util.PDFutil;

@Controller
@RequestMapping(value = "/job")
public class JobBoardController {
	private static final Logger logger = LoggerFactory.getLogger(JobBoardController.class);

	@Autowired
	private JobBoardService jobBoardService;

	@RequestMapping(value = "/joblist", method = RequestMethod.GET)
	public void list(Model model, HttpServletRequest req, HttpSession session, JobBoardVO vo) {
		
		
		List<JobBoardVO> list = jobBoardService.list(vo);
		model.addAttribute("job",list);
		
	}

	
	
	
	@RequestMapping(value = "/job-register", method = RequestMethod.GET)
	public void jobinsertGET(Model model) {
		logger.info("register1");

//		PDFutil pdf = new PDFutil();
//		pdf.saveUploadedFile("C:/mycollection/mycollection/pdftest/test.pdf");

	}

	
	
	
	
	@RequestMapping(value = "/job-register", method = RequestMethod.POST)
	public String jobinsertPOST(JobBoardVO vo, Model model) {
		logger.info("register2");
		
		
		
		return "redirect:/job/joblist";

	}

}
