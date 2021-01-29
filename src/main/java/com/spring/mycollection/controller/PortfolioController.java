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

import com.spring.mycollection.domain.PortfolioBoardVO;
import com.spring.mycollection.service.PortfolioBoardService;

@Controller
@RequestMapping(value = "/portfolio")
public class PortfolioController {
	private static final Logger logger = LoggerFactory.getLogger(PortfolioController.class);

	@Autowired
	private PortfolioBoardService portfolioBoardService;

	@RequestMapping(value = "/myportfoliolist", method = RequestMethod.GET)
	public void frcList(Model model, HttpServletRequest req, HttpSession session) {
		//String sessionHomeId = (String) session.getAttribute("homeId");
	
		String sessionHomeId ="do0610";
		List<PortfolioBoardVO> list= portfolioBoardService.read(sessionHomeId);
		

		
		model.addAttribute("portfoliolist", list);
	}
	
	
	
	
	
	
	

}
