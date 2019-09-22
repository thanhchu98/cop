package com.chiasetailieu.dao;

import java.util.List;

import com.chiasetailieu.model.Category;
import com.chiasetailieu.model.Document;
import com.chiasetailieu.model.SubCategory;

public interface ISubcategoryDAO extends IGenericDAO<SubCategory>{
	List<SubCategory> findAll();
	List<SubCategory> findByCategories(Category category);
	List<SubCategory> findOneByDocument(Document document);
	SubCategory findOneById(int id);
	int save(SubCategory subcate);
	void update(SubCategory subcate);
	void delete(SubCategory subcate);
}
