package com.spring.mycollection.service;

import java.util.List;


import com.spring.mycollection.domain.JobBoardVO;


public interface JobBoardService {

	 public abstract List<JobBoardVO> read(String homeId);
	
	//public abstract JobBoardVO read(int job_bno);
	
	
	
} // end JobBoardService{}
