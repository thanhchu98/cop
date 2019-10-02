package com.chiasetailieu.dao;

import java.util.List;

import com.chiasetailieu.model.User;

public interface IUserDAO extends IGenericDAO<User>{
	User findByUserNameAndPassword(String username, String password);
	User findById(Long id);
	List<User> findAll();
	Long save(User user);
	void update(User user);
	void delete(User user);
}
