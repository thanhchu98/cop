package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chiasetailieu.model.Role;


public class RoleMapper implements GenericMapper<Role> {

	@Override
	public Role mapRow(ResultSet resultSet) {
		try {
			Role role = new Role();
			role.setRoleid(resultSet.getLong("role_id"));
			role.setRolename(resultSet.getString("role_name"));
			return role;
		} catch (SQLException e) {
			return null;
		}	
	}
}