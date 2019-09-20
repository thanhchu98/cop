package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;

public interface GenericMapper<T> {
	T mapRow(ResultSet rs);
}
