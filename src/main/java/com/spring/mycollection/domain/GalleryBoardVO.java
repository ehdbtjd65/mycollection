package com.spring.mycollection.domain;

import java.util.Date;

public class GalleryBoardVO {

	private int gallery_bno;
	private String user_id;
	private String user_name;
	private String gallery_title;
	private String gallery_photo_url;
	private Date gallery_date;
	private int gallery_like;
	
	
	public GalleryBoardVO() {}


	public GalleryBoardVO(int gallery_bno, String user_id, String user_name, String gallery_title,
			String gallery_photo_url, Date gallery_date, int gallery_like) {
		super();
		this.gallery_bno = gallery_bno;
		this.user_id = user_id;
		this.user_name = user_name;
		this.gallery_title = gallery_title;
		this.gallery_photo_url = gallery_photo_url;
		this.gallery_date = gallery_date;
		this.gallery_like = gallery_like;
	}


	public int getGallery_bno() {
		return gallery_bno;
	}


	public void setGallery_bno(int gallery_bno) {
		this.gallery_bno = gallery_bno;
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


	public String getGallery_title() {
		return gallery_title;
	}


	public void setGallery_title(String gallery_title) {
		this.gallery_title = gallery_title;
	}


	public String getGallery_photo_url() {
		return gallery_photo_url;
	}


	public void setGallery_photo_url(String gallery_photo_url) {
		this.gallery_photo_url = gallery_photo_url;
	}


	public Date getGallery_date() {
		return gallery_date;
	}


	public void setGallery_date(Date gallery_date) {
		this.gallery_date = gallery_date;
	}


	public int getGallery_like() {
		return gallery_like;
	}


	public void setGallery_like(int gallery_like) {
		this.gallery_like = gallery_like;
	}
	
	
	
	
} // end GalleryBoardVO{}
