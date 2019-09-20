package com.chiasetailieu.dao;

import java.util.List;

import com.chiasetailieu.dao.mapper.GenericMapper;

public interface IGenericDAO<T> {
	List<T> query(String sql, GenericMapper<T> mapper, Object... parameters);
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
