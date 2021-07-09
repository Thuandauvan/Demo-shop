package com.shoes.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoes.model.ProductModel;
import com.shoes.service.IProductService;
import com.shoes.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-product"}) 
public class ProductAPI extends HttpServlet {
	
	@Inject
	private IProductService productService;

	private static final long serialVersionUID = 6623082960828873099L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ProductModel productModel = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
		productModel = productService.save(productModel);
		mapper.writeValue(response.getOutputStream(), productModel);
		
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
}
