package com.spring.mycollection.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mycollection.domain.JobBoardVO;

@Repository
public class JobBoardDAOImple implements JobBoardDAO{

	private static final String NAMESPACE = "com.spring.mycollection.JobBoardMapper";
	private static final Logger logger = LoggerFactory.getLogger(JobBoardDAOImple.class);
	
	@Autowired
	//private SqlSession sqlSession;
	
	
	@Override
	public JobBoardVO select(int job_bno) {
		
		return null;
	}

	@Override
	public int insert(JobBoardVO vo) {
		
		return 0;
	}

	@Override
	public int update(JobBoardVO vo) {
		
		return 0;
	}

	@Override
	public int delete(int job_bno) {
		
		return 0;
	}

}
