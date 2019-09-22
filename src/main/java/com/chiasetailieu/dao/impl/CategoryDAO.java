package com.chiasetailieu.dao.impl;

import java.util.List;

import com.chiasetailieu.dao.ICategoryDAO;
import com.chiasetailieu.dao.mapper.CategoryMapper;
import com.chiasetailieu.model.Category;

public class CategoryDAO extends GenericDAO<Category> implements ICategoryDAO{

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public Category findOneById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from category where cate_id = ?";
		List<Category> cates = query(sql, new CategoryMapper(), id);
		return cates.isEmpty()? null : cates.get(0);
	}
	
}
