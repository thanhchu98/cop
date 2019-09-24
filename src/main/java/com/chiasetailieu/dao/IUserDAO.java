package com.chiasetailieu.dao;

import com.chiasetailieu.model.User;

public interface IUserDAO extends IGenericDAO<User>{
	User findByUserNameAndPassword(String username, String password);
	User findById(Long id);
	Long save(User user);
	void update(User user);
	void delete(User user);
}
