package com.spring.mycollection.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
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
	private SqlSession sqlSession;
	
	
	@Override
	public List<JobBoardVO> list(JobBoardVO vo) {
		logger.info("list() 호출 : vo " + vo);
		return sqlSession.selectList(NAMESPACE + ".list", vo);
	}

	@Override
	public int insert(JobBoardVO vo) {
		logger.info("insert() 호출");
		return sqlSession.insert(NAMESPACE + ".insert", vo);
	}

	


}
