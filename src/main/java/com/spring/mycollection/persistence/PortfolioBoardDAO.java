package com.spring.mycollection.persistence;

import com.spring.mycollection.domain.PortfolioBoardVO;
	
public interface PortfolioBoardDAO {



	public abstract PortfolioBoardVO select(String homeId);
	public abstract int create(PortfolioBoardVO vo);
	
} // end PortfolioBoardDAO
