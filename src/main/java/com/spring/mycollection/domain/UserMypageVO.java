package com.spring.mycollection.domain;

public class UserMypageVO {

	private String user_id;
	private String user_name;
	private String profile_url;
	private String email_private;
	private String phone_private;
	private String sns_instargram;
	private String sns_facebook;
	
	public UserMypageVO () {}

	
	public UserMypageVO(String user_id, String user_name, String profile_url, String email_private,
			String phone_private, String sns_instargram, String sns_facebook) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.profile_url = profile_url;
		this.email_private = email_private;
		this.phone_private = phone_private;
		this.sns_instargram = sns_instargram;
		this.sns_facebook = sns_facebook;
	}


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getProfile_url() {
		return profile_url;
	}

	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}

	public String getEmail_private() {
		return email_private;
	}

	public void setEmail_private(String email_private) {
		this.email_private = email_private;
	}

	public String getPhone_private() {
		return phone_private;
	}

	public void setPhone_private(String phone_private) {
		this.phone_private = phone_private;
	}

	public String getSns_instargram() {
		return sns_instargram;
	}

	public void setSns_instargram(String sns_instargram) {
		this.sns_instargram = sns_instargram;
	}

	public String getSns_facebook() {
		return sns_facebook;
	}

	public void setSns_facebook(String sns_facebook) {
		this.sns_facebook = sns_facebook;
	}
	
	
	
} // end UserMypageVO{}
