package com.spring.mycollection.service;

import com.spring.mycollection.domain.PortfolioBoardVO;

public interface PortfolioBoardService {

	public abstract  PortfolioBoardVO read(String homeId);
	
	
	public abstract  int create(PortfolioBoardVO vo); // ���������� �� ���� 
	
	
	
}
