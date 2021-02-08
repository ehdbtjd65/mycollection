package com.spring.mycollection.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mycollection.domain.PortfolioBoardVO;
import com.spring.mycollection.persistence.PortfolioBoardDAO;

@Service
public class PortfolioBoardServiceImple implements PortfolioBoardService {
	   private static final Logger logger = 
		         LoggerFactory.getLogger(PortfolioBoardServiceImple.class);
		   
	
	@Autowired
	private PortfolioBoardDAO dao;
	
	@Override
	public PortfolioBoardVO read(String homeId) {
		 logger.info("PortfolioBoardDAO read() »£√‚");
		 
		return dao.select(homeId);
	}
	
	@Override
	public int create(PortfolioBoardVO vo) {
		// TODO Auto-generated method stub
		return dao.create(vo);
	}
	
	
}
