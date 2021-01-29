package com.spring.mycollection.persistence;


import java.util.List;

import com.spring.mycollection.domain.PortfolioBoardVO;


public interface PortfolioBoardDAO {

	public abstract List<PortfolioBoardVO> select(String homeId);
	


	
} // end PortfolioBoardDAO
