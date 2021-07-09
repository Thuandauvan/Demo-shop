package com.shoes.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.model.ProductModel;
import com.shoes.paging.PageRequest;
import com.shoes.paging.Pageble;
import com.shoes.service.impl.ProductService;
import com.shoes.sort.Sorter;
import com.shoes.utils.FormUtil;

import constant.SystemConstant;

@WebServlet(urlPatterns = { "/admin-product" })
public class ProductController extends HttpServlet {

	@Inject
	private ProductService productService;
	
	private static final long serialVersionUID = 7248880694437048450L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductModel model = FormUtil.toModel(ProductModel.class, request);
		Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
				                          new Sorter(model.getSortName(), model.getSortType()));
		model.setListResult(productService.findAll(pageble));
		model.setTotalItem(productService.getTotalItem());
		model.setTotalPage((int) Math.ceil ((double) model.getTotalItem() / model.getMaxPageItem()));
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/product/list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}