package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chiasetailieu.model.SubCategory;

public class SubcateMapper implements GenericMapper<SubCategory>{

	@Override
	public SubCategory mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			SubCategory subcate = new SubCategory();
			subcate.setSubcategoryID(rs.getLong("subcate_id"));
			subcate.setCategoryId(rs.getInt("cate_id"));
			subcate.setSubcategoryName(rs.getString("subcate_name"));
			return subcate;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
	}
	
}
