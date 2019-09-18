package com.chiasetailieu.model;

import java.util.List;

public class Category {
	private int categoryID;
	private String categoryName;
	private List<SubCategory> subcates;
	
	
	public List<SubCategory> getSubcates() {
		return subcates;
	}
	public void setSubcates(List<SubCategory> subcates) {
		this.subcates = subcates;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
