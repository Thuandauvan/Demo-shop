package com.shoes.service;

import java.util.List;

import com.shoes.model.ProductModel;
import com.shoes.paging.Pageble;

public interface IProductService {
	List<ProductModel> findByCategoryId(Long categoryId);
	ProductModel save(ProductModel productModel);
	List<ProductModel> findAll(Pageble pageble);
	int getTotalItem();
}
