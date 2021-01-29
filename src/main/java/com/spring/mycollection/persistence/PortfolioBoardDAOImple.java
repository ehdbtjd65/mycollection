package com.spring.mycollection.persistence;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mycollection.domain.PortfolioBoardVO;


@Repository
public class PortfolioBoardDAOImple implements PortfolioBoardDAO {
	private static final String NAMESPACE = "com.spring.mycollection.PortfolioBoardMapper";
	private static final Logger logger = LoggerFactory.getLogger(PortfolioBoardDAOImple.class);
//@Autowired
//	private SqlSession sqlSession;

	@Override
	public List<PortfolioBoardVO> select(String homeId) {
		// TODO Auto-generated method stub
		return null; //sqlSession.selectList(NAMESPACE+".select_all" , homeId);
	}
} // end PortfolioBoardDAOImple {}

