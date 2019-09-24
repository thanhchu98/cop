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

	@Override
	public Long save(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into user (user_name, password, role_id) values (?,?,2)";
		return insert(sql, user.getUsername(), user.getPassword());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		String sql = "update user set user_name = ?, password = ? where user_id = ?";
		update(sql, user.getUsername(), user.getPassword(), user.getUserid());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		String sql = "delete from user where user_name = ?";
		delete(sql, user.getUsername());
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "select * from user inner join role on user.role_id = role.role_id"
				+ "where user_id = ?";
		List<User> users = query(sql, new UserMapper(), id);
		return users.isEmpty()?null:users.get(0);
	}
	
}
