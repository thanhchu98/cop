package com.chiasetailieu.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.chiasetailieu.dao.IRoleDAO;
import com.chiasetailieu.dao.IUserDAO;
import com.chiasetailieu.model.User;
import com.chiasetailieu.service.IUserService;

public class UserService implements IUserService{

	@Inject
	IUserDAO userDAO;
	
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		Long newId = userDAO.save(user);
		return userDAO.findById(newId);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDAO.delete(user);
	}

}
