package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chiasetailieu.model.Role;
import com.chiasetailieu.model.User;

public class UserMapper implements GenericMapper<User> {

	@Override
	public User mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			RoleMapper rolemap = new RoleMapper();
			User user = new User();
			user.setUserid(rs.getInt("user_id"));
			user.setUsername(rs.getString("user_name"));
			user.setPassword(rs.getString("password"));
			Role role = rolemap.mapRow(rs);
			user.setRole(role);
			return user;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
}
