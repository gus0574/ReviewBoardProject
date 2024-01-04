package com.ldh.web.reviewboard.board.dto;

import java.time.LocalDateTime;

public class PostVO {
	
	// 카멜케이스로 작성 
	private String postId;
	private String userId;
	private String status;
	private String category;
	private String title;
	private String content;
	private int likeCount;
	private int dislikeCount;
	private int viewCount;
	private char attachedFileYn;
	private char noticeYn;
	private char deleteYn;
	private LocalDateTime createdTime;
	private LocalDateTime updatedTime;
	
	public String getPostId() {
		return postId;
	}
	public String getUserId() {
		return userId;
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
	public int getLikeCount() {
		return likeCount;
	}
	public int getDislikeCount() {
		return dislikeCount;
	}
	public int getViewCount() {
		return viewCount;
	}
	public char getAttachedFileYn() {
		return attachedFileYn;
	}
	public char getNoticeYn() {
		return noticeYn;
	}
	public char getDeleteYn() {
		return deleteYn;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}

}
