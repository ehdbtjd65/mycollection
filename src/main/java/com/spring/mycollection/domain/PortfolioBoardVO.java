package com.spring.mycollection.domain;

import java.util.Date;

public class PortfolioBoardVO {

	private int portfolio_bno;
	private String user_id;
	private String portfolio_url;
	private String portfolio_file_url;
	private Date portfolio_date;
	private int portfolio_like;
	
	public PortfolioBoardVO() {}

	public PortfolioBoardVO(int portfolio_bno, String user_id, String portfolio_url, String portfolio_file_url,
			Date portfolio_date, int portfolio_like) {
		super();
		this.portfolio_bno = portfolio_bno;
		this.user_id = user_id;
		this.portfolio_url = portfolio_url;
		this.portfolio_file_url = portfolio_file_url;
		this.portfolio_date = portfolio_date;
		this.portfolio_like = portfolio_like;
	}

	public int getPortfolio_bno() {
		return portfolio_bno;
	}

	public void setPortfolio_bno(int portfolio_bno) {
		this.portfolio_bno = portfolio_bno;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPortfolio_url() {
		return portfolio_url;
	}

	public void setPortfolio_url(String portfolio_url) {
		this.portfolio_url = portfolio_url;
	}

	public String getPortfolio_file_url() {
		return portfolio_file_url;
	}

	public void setPortfolio_file_url(String portfolio_file_url) {
		this.portfolio_file_url = portfolio_file_url;
	}

	public Date getPortfolio_date() {
		return portfolio_date;
	}

	public void setPortfolio_date(Date portfolio_date) {
		this.portfolio_date = portfolio_date;
	}

	public int getPortfolio_like() {
		return portfolio_like;
	}

	public void setPortfolio_like(int portfolio_like) {
		this.portfolio_like = portfolio_like;
	}

	
	
} // end PortfolioVO
