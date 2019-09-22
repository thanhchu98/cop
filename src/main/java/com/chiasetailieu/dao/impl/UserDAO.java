package com.chiasetailieu.dao.impl;

import java.util.List;

import com.chiasetailieu.dao.IUserDAO;
import com.chiasetailieu.dao.mapper.UserMapper;
import com.chiasetailieu.model.User;

public class UserDAO extends GenericDAO<User> implements IUserDAO{

	@Override
	public User findByUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from user inner join role on user.role_id = role.role_id"
				+ "where username = ? and password = ?";
		List<User> users = query(sql, new UserMapper(), username, password);
		return users.isEmpty()?null:users.get(0);
	}
	
}
