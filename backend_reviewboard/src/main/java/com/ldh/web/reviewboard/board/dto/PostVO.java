package com.ldh.web.reviewboard.board.dto;

import java.time.LocalDateTime;

public class PostVO {
	
	private String post_id;
	private String user_id;
	private String status;
	private String category;
	private String title;
	private String content;
	private int like_count;
	private int dislike_count;
	private int view_count;
	private char attached_file_yn;
	private char notice_yn;
	private LocalDateTime created_time;
	private LocalDateTime updated_time;
	
	public String getPost_id() {
		return post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getStatus() {
		return status;
	}
	public String getCategory() {
		return category;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public int getLike_count() {
		return like_count;
	}
	public int getDislike_count() {
		return dislike_count;
	}
	public int getView_count() {
		return view_count;
	}
	public char getAttached_file_yn() {
		return attached_file_yn;
	}
	public char getNotice_yn() {
		return notice_yn;
	}
	public LocalDateTime getCreated_time() {
		return created_time;
	}
	public LocalDateTime getUpdated_time() {
		return updated_time;
	}
	
}
