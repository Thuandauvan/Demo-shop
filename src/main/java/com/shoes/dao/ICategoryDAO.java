package com.shoes.dao;

import java.util.List;

import com.shoes.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
}
