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
			User user = new User();
			user.setUserid(rs.getLong("user_id"));
			user.setUsername(rs.getString("user_name"));
			user.setPassword(rs.getString("password"));
			user.setRoleId(rs.getLong("role_id"));
			return user;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
}
