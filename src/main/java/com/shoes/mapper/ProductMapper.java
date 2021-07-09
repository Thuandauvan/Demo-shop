package com.shoes.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.shoes.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel> {

	@Override
	public ProductModel mapRow(ResultSet resultSet) {
		ProductModel product = new ProductModel();
		try {
			product.setId(resultSet.getLong("id"));
			product.setImage(resultSet.getString("image"));
			product.setTitle(resultSet.getString("title"));
			product.setPrice(resultSet.getDouble("price"));
			product.setShortDescription(resultSet.getString("Shortdescription"));
			product.setCategoryId(resultSet.getLong("categoryid"));
			product.setCreatedDate(resultSet.getTimestamp("createddate"));
			product.setCreatedBy(resultSet.getString("createdby"));
			if (resultSet.getTimestamp("modifieddate") != null) {
				product.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if (resultSet.getString("modifiedby") != null) {
				product.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return product;
		} catch (SQLException e) {
			return null;
		}
	}

}
