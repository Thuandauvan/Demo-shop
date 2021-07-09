package com.shoes.dao;

import java.util.List;

import com.shoes.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List <T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	Long insert(String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
