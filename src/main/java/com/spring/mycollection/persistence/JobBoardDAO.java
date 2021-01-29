package com.spring.mycollection.persistence;

import com.spring.mycollection.domain.JobBoardVO;

public interface JobBoardDAO {

	public abstract JobBoardVO select(int job_bno);
	
	public abstract int insert(JobBoardVO vo);
	
	public abstract int update(JobBoardVO vo);
	
	public abstract int delete(int job_bno);
	
	
}
