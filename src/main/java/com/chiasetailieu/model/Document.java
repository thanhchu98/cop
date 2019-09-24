package com.chiasetailieu.model;

public class Document {
	private Long docId;
	private String docName;
	private String docSource;
	private int cateId;
	private int subcateId;
	private int userId;
	private User user;
	private Category category;
	private SubCategory subcate;
	private String cover;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocSource() {
		return docSource;
	}
	public void setDocSource(String docSource) {
		this.docSource = docSource;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public int getSubcateId() {
		return subcateId;
	}
	public void setSubcateId(int subcateId) {
		this.subcateId = subcateId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public SubCategory getSubcate() {
		return subcate;
	}
	public void setSubcate(SubCategory subcate) {
		this.subcate = subcate;
	}
	
	
}
