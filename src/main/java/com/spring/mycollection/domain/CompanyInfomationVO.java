package com.spring.mycollection.domain;

public class CompanyInfomationVO {

	private String company_name;
	private String company_id;
	private String company_pw;
	private String company_email;
	private String company_phone;

	public CompanyInfomationVO() {
	}

	public CompanyInfomationVO(String company_name, String company_id, String company_pw, String company_email,
			String company_phone) {
		super();
		this.company_name = company_name;
		this.company_id = company_id;
		this.company_pw = company_pw;
		this.company_email = company_email;
		this.company_phone = company_phone;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getCompany_pw() {
		return company_pw;
	}

	public void setCompany_pw(String company_pw) {
		this.company_pw = company_pw;
	}

	public String getCompany_email() {
		return company_email;
	}

	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}

	public String getCompany_phone() {
		return company_phone;
	}

	public void setCompany_phone(String company_phone) {
		this.company_phone = company_phone;
	}

} // end CompanyInfomationVO {}
