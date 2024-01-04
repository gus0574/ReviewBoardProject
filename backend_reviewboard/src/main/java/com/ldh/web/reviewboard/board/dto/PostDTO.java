package com.ldh.web.reviewboard.board.dto;

public class PostDTO {

	private String postId;
	private String userId;
	private String category;
	private String title;
	private String content;
	private char attachedFileYn;
	private char noticeYn;
	
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public char getAttachedFileYn() {
		return attachedFileYn;
	}
	public void setAttachedFileYn(char attachedFileYn) {
		this.attachedFileYn = attachedFileYn;
	}
	public char getNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(char noticeYn) {
		this.noticeYn = noticeYn;
	}
	
	@Override
	public String toString() {
		return "PostDTO [postId=" + postId + ", userId=" + userId + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", attachedFileYn=" + attachedFileYn + ", noticeYn=" + noticeYn + "]";
	}
	
}
