package com.shoes.dao;

import java.util.List;

import com.shoes.model.ProductModel;
import com.shoes.paging.Pageble;

public interface IProductDAO extends GenericDAO<ProductModel>{
	List<ProductModel> findByCategoryId(Long categoryId);
	Long save(ProductModel productModel);
	ProductModel findOne(Long id);
	List<ProductModel> findAll(Pageble pageble);
	int gettotalItem();
}
