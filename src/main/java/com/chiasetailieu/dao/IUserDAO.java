package com.chiasetailieu.dao;

import com.chiasetailieu.model.User;

public interface IUserDAO extends IGenericDAO<User>{
	User findByUserNameAndPassword(String username, String password);
	
}
