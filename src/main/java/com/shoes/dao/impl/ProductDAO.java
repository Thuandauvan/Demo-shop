package com.shoes.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shoes.dao.IProductDAO;
import com.shoes.mapper.ProductMapper;
import com.shoes.model.ProductModel;
import com.shoes.paging.Pageble;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO{

	@Override
	public List<ProductModel> findByCategoryId(Long categoryId) {
		
		String sql = "SELECT * FROM product WHERE categoryid = ?";
		return query(sql, new ProductMapper(), categoryId);
	}

	@Override
	public Long save(ProductModel productModel) {
		String sql = "INSERT INTO product(title,price,shortdescription,categoryid,createddate,createdby) VALUES(?, ?, ?, ?, ?, ?) ";
		return insert(sql, productModel.getTitle(), productModel.getPrice(),
				      productModel.getShortDescription(), productModel.getCategoryId(),
                      productModel.getCreatedDate(),productModel.getCreatedBy());
	}

	@Override
	public ProductModel findOne(Long id) {
		String sql = "SELECT * FROM product WHERE id = ?";
		List<ProductModel> results = query(sql, new ProductMapper(), id);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public List<ProductModel> findAll(Pageble pageble){
		StringBuilder sb = new StringBuilder("SELECT * FROM product");
		if(pageble.sorter().getSortName() != null && pageble.sorter().getSortType() != null) {
			sb.append(" ORDER BY " + pageble.sorter().getSortName() +" " + pageble.sorter().getSortType() +" ");
		}
		if(pageble.getOffset() != null && pageble.getLimit() != null) {
			sb.append("limit " + pageble.getOffset()+ ", " + pageble.getLimit() + "");
		}
		return query(sb.toString(), new ProductMapper());
	}

	@Override
	public int gettotalItem() {
		String sql = "SELECT count(*) from product";
		return count(sql);
	}

}
