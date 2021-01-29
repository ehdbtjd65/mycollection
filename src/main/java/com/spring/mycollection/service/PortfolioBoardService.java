package com.spring.mycollection.service;

import java.util.List;

import com.spring.mycollection.domain.PortfolioBoardVO;

public interface PortfolioBoardService {

	public abstract List<PortfolioBoardVO> read(String homeId);
	
	
	
}
