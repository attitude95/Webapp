package com.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DBConnection;
import com.model.Product;

@Controller
public class AddProduct {

	private DBConnection dbConnection;
	@Autowired
	public AddProduct(DBConnection dbConnection) {
		this.dbConnection=dbConnection;
	}
	@RequestMapping("/addProductForm")
	public ModelAndView addProductForm() {
		ModelAndView mv=new ModelAndView("addProductForm");
		return mv;
	}
	@RequestMapping("/addProduct")
	public ModelAndView addProduct(@ModelAttribute("product")Product product) {
		Connection connection=dbConnection.getConnection();
		boolean result=false;
		ModelAndView mv=null;
		System.out.println(product.getProductName()+" "+product.getEnterpriseGstn()+" "+product.getProductPrice());;
		try {
			Statement statement=connection.createStatement();
			String sql="INSERT INTO PRODUCT VALUES ('"+product.getProductName()+"','"+product.getEnterpriseGstn()+"','"+product.getProductPrice()+"')";
			 result=statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbConnection.closeConnection(connection);
		}
		if(!result) {
			mv=new ModelAndView("addProductSuccess");
			
		}
		else {
			mv=new ModelAndView("addProductFailure");
		}
		mv.addObject(product);
		return mv;
		
	}
}
