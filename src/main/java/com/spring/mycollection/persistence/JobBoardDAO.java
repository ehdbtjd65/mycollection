package com.spring.mycollection.persistence;

import java.util.List;

import com.spring.mycollection.domain.JobBoardVO;

public interface JobBoardDAO {

	public abstract List<JobBoardVO> select(String homeId);
	
	public abstract int insert(JobBoardVO vo);
	
	public abstract int update(JobBoardVO vo);
	
	public abstract int delete(int job_bno);
	
	
	
}
