package com.chiasetailieu.dao;

public interface GenericDAO {
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
