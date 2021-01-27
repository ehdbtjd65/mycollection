package com.spring.mycollection.domain;

import java.util.Date;

public class JobBoardVO {

	private int job_bno;
	private String job_email;
	private String job_title;
	private String job_content;
	private String job_company_name;
	private Date job_date;
	private Date job_end_date;
	private String job_photo_url;
	private String job_map;
	private String job_company_url;
	
	public JobBoardVO() {}

	public JobBoardVO(int job_bno, String job_email, String job_title, String job_content, String job_company_name,
			Date job_date, Date job_end_date, String job_photo_url, String job_map, String job_company_url) {
		super();
		this.job_bno = job_bno;
		this.job_email = job_email;
		this.job_title = job_title;
		this.job_content = job_content;
		this.job_company_name = job_company_name;
		this.job_date = job_date;
		this.job_end_date = job_end_date;
		this.job_photo_url = job_photo_url;
		this.job_map = job_map;
		this.job_company_url = job_company_url;
	}

	public int getJob_bno() {
		return job_bno;
	}

	public void setJob_bno(int job_bno) {
		this.job_bno = job_bno;
	}

	public String getJob_email() {
		return job_email;
	}

	public void setJob_email(String job_email) {
		this.job_email = job_email;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_content() {
		return job_content;
	}

	public void setJob_content(String job_content) {
		this.job_content = job_content;
	}

	public String getJob_company_name() {
		return job_company_name;
	}

	public void setJob_company_name(String job_company_name) {
		this.job_company_name = job_company_name;
	}

	public Date getJob_date() {
		return job_date;
	}

	public void setJob_date(Date job_date) {
		this.job_date = job_date;
	}

	public Date getJob_end_date() {
		return job_end_date;
	}

	public void setJob_end_date(Date job_end_date) {
		this.job_end_date = job_end_date;
	}

	public String getJob_photo_url() {
		return job_photo_url;
	}

	public void setJob_photo_url(String job_photo_url) {
		this.job_photo_url = job_photo_url;
	}

	public String getJob_map() {
		return job_map;
	}

	public void setJob_map(String job_map) {
		this.job_map = job_map;
	}

	public String getJob_company_url() {
		return job_company_url;
	}

	public void setJob_company_url(String job_company_url) {
		this.job_company_url = job_company_url;
	}
	
	
	
	
} // end JobBoardVO{}
