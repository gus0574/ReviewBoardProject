package com.ldh.web.reviewboard.board.dto;

public class PostDTO {

	private String post_id;
	private String user_id;
	private String category;
	private String title;
	private String content;
	private char attached_file_yn;
	private char notice_yn;
	
	public String getPost_id() {
		return post_id;
	}
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public char getAttached_file_yn() {
		return attached_file_yn;
	}
	public void setAttached_file_yn(char attached_file_yn) {
		this.attached_file_yn = attached_file_yn;
	}
	public char getNotice_yn() {
		return notice_yn;
	}
	public void setNotice_yn(char notice_yn) {
		this.notice_yn = notice_yn;
	}
	
	@Override
	public String toString() {
		return "PostDTO [post_id=" + post_id + ", user_id=" + user_id + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", attached_file_yn=" + attached_file_yn + ", notice_yn=" + notice_yn + "]";
	}
	
}
