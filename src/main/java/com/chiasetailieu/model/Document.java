package com.chiasetailieu.model;

public class Document {
	private int docId;
	private String docName;
	private String docSource;
	private int cateId;
	private int subcateId;
	private Category category;
	private SubCategory subcate;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
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
