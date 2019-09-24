package com.chiasetailieu.dao.impl;

import java.util.List;

import com.chiasetailieu.dao.IRoleDAO;
import com.chiasetailieu.dao.mapper.CategoryMapper;
import com.chiasetailieu.dao.mapper.RoleMapper;
import com.chiasetailieu.model.Category;
import com.chiasetailieu.model.Role;

public class RoleDAO extends GenericDAO<Role> implements IRoleDAO{

	@Override
	public Role findById(Long id) {
		String sql = "select * from role where role_id = ?";
		List<Role> roles = query(sql, new RoleMapper(), id);
		return roles.isEmpty()? null : roles.get(0);
	}

}
