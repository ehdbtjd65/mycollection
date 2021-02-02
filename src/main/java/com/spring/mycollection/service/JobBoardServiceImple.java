package com.spring.mycollection.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mycollection.domain.JobBoardVO;
import com.spring.mycollection.persistence.JobBoardDAO;

@Service
public class JobBoardServiceImple implements JobBoardService {
	private static final Logger logger = LoggerFactory.getLogger(JobBoardServiceImple.class);
	
	@Autowired
	private JobBoardDAO dao;

	//��ü����
	@Override
	public List<JobBoardVO> read(String homeId) {
		logger.info("JobBoardDAO read() ȣ��");
		return null;//jobBoardDAO.select(homeId);
	}



}
