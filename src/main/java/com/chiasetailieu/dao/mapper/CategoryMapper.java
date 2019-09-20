package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chiasetailieu.model.Category;

public class CategoryMapper implements GenericMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			Category cate = new Category();
			cate.setCategoryID(rs.getInt("cate_id"));
			cate.setCategoryName(rs.getString("cate_name"));
			return cate;
		} catch (SQLException e) {
			return null;
		}	
	}
		
}
