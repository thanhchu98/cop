package com.chiasetailieu.dao;

import java.util.List;

import com.chiasetailieu.model.Category;

public interface ICategoryDAO extends IGenericDAO<Category> {
	List<Category> findAll();
	Category findOneById(int id);
	
}
