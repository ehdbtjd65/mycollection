package com.spring.mycollection.persistence;

import java.util.List;

import com.spring.mycollection.domain.JobBoardVO;

public interface JobBoardDAO {

	public abstract List<JobBoardVO> list(JobBoardVO vo);
	
	public abstract int insert(JobBoardVO vo);
	
	
	
	
}
