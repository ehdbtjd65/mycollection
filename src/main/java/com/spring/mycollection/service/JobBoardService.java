package com.spring.mycollection.service;

import java.util.List;


import com.spring.mycollection.domain.JobBoardVO;


public interface JobBoardService {

	 public abstract List<JobBoardVO> list(JobBoardVO vo);
	
	public abstract int insert(JobBoardVO vo);
	
	
	
} // end JobBoardService{}
