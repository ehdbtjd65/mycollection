
package com.spring.mycollection.domain;

public class GalleryReplyVO {

	private int gallery_rno;
	private int gallery_bno;
	private String gallery_r_contents;
	public int getGallery_rno() {
		return gallery_rno;
	}
	public void setGallery_rno(int gallery_rno) {
		this.gallery_rno = gallery_rno;
	}
	public int getGallery_bno() {
		return gallery_bno;
	}
	public void setGallery_bno(int gallery_bno) {
		this.gallery_bno = gallery_bno;
	}
	public String getGallery_r_contents() {
		return gallery_r_contents;
	}
	public void setGallery_r_contents(String gallery_r_contents) {
		this.gallery_r_contents = gallery_r_contents;
	}
	public GalleryReplyVO(int gallery_rno, int gallery_bno, String gallery_r_contents) {
		
		this.gallery_rno = gallery_rno;
		this.gallery_bno = gallery_bno;
		this.gallery_r_contents = gallery_r_contents;
	}
	
	
	
	
	
} // end GalleryReplyVO{}
