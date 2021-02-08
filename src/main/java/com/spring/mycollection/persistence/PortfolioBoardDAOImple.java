package com.spring.mycollection.persistence;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mycollection.domain.PortfolioBoardVO;


@Repository
public class PortfolioBoardDAOImple implements PortfolioBoardDAO {
	private static final String NAMESPACE = "com.spring.mycollection.PortfolioBoardMapper";
	private static final Logger logger = LoggerFactory.getLogger(PortfolioBoardDAOImple.class);
@Autowired
	private SqlSession sqlSession;

	@Override
	public PortfolioBoardVO select(String homeId) {
		logger.info("mypage load homeid ==   "+homeId);
		return sqlSession.selectOne(NAMESPACE+".select_fortfolio_homeid" , homeId);
	}
	
	
	@Override
	public int create(PortfolioBoardVO vo) {
		logger.info(vo.getPortfolio_url()+"    /     "+ vo.getUser_id());
		return sqlSession.insert(NAMESPACE+".create", vo);
	}
} // end PortfolioBoardDAOImple {}

