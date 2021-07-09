package com.shoes.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.shoes.dao.ICategoryDAO;
import com.shoes.model.CategoryModel;
import com.shoes.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDao;
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

}
