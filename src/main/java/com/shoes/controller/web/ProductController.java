package com.shoes.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.model.ProductModel;
import com.shoes.service.ICategoryService;
import com.shoes.service.IProductService;

@WebServlet(urlPatterns = {"/chi-tiet-san-pham"})
public class ProductController extends HttpServlet{

	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private IProductService productService;
	
	private static final long serialVersionUID = 7248880694437048450L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("categories", categoryService.findAll());		
		RequestDispatcher rd=request.getRequestDispatcher("/views/web/product/product.jsp");    
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

}
