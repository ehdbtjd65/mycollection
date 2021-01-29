package com.spring.mycollection.persistence;

import com.spring.mycollection.domain.PortfolioBoardVO;

public interface PortfolioBoardDAO {

	public abstract PortfolioBoardVO select(int portfolio_bno);
	
	public abstract int insert(PortfolioBoardVO vo);
	
	public abstract int update(PortfolioBoardVO vo);
	
	public abstract int delete(int protfolio_bno);
	
	
}
