package com.chiasetailieu.dao.impl;

import java.util.List;

import com.chiasetailieu.dao.ISubcategoryDAO;
import com.chiasetailieu.dao.mapper.SubcateMapper;
import com.chiasetailieu.model.Category;
import com.chiasetailieu.model.Document;
import com.chiasetailieu.model.SubCategory;

public class SubcateDAO extends GenericDAO<SubCategory> implements ISubcategoryDAO{

	@Override
	public List<SubCategory> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from subcate";
		return query(sql, new SubcateMapper());
	}

	@Override
	public List<SubCategory> findByCategories(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubCategory> findOneByDocument(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubCategory findOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(SubCategory subcate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SubCategory subcate) {
		// TODO Auto-generated method stub
		String sql = "update subcate set cate_id = ?, subcate_name = ? where subcate_id = ?";
		update(sql, subcate.getCategoryId(), subcate.getSubcategoryName(), subcate.getSubcategoryID());
	}

	@Override
	public void delete(SubCategory subcate) {
		// TODO Auto-generated method stub
		String sql = "Delete from subcate where subcate_id = ?";
		update(sql, subcate.getSubcategoryID());
	}
	
}
