package com.shoes.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.shoes.dao.IProductDAO;
import com.shoes.model.ProductModel;
import com.shoes.paging.Pageble;
import com.shoes.service.IProductService;

public class ProductService implements IProductService{

	@Inject
	private IProductDAO productDao;
	@Override
	public List<ProductModel> findByCategoryId(Long categoryId) {
		return productDao.findByCategoryId(categoryId);
	}
	@Override
	public ProductModel save(ProductModel productModel) {
		return productDao.findOne(productDao.save(productModel));
	}
	public List<ProductModel> findAll(Pageble pageble) {
		return productDao.findAll(pageble);
	}
	@Override
	public int getTotalItem() {
		return productDao.gettotalItem();
	}

}
