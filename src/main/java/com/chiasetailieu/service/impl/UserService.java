package com.chiasetailieu.service.impl;

import javax.inject.Inject;

import com.chiasetailieu.dao.IRoleDAO;
import com.chiasetailieu.dao.IUserDAO;
import com.chiasetailieu.model.User;
import com.chiasetailieu.service.IUserService;

public class UserService implements IUserService{

	@Inject
	IUserDAO userDAO;
	
	@Inject
	IRoleDAO roleDAO;
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		Long newId = userDAO.save(user);
		return userDAO.findById(newId);
	}

}
