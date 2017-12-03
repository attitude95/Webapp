package com.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DBConnection;
import com.model.Enterprise;
import com.model.Product;

@Controller
public class View {

	private DBConnection DAO;
	
	@Autowired
	public View(DBConnection DAO) {
		this.DAO=DAO;
	}
	
	@RequestMapping("viewEnterprise")
	public ModelAndView viewEnterprise()
	{
		Connection connection=DAO.getConnection();
		String sql="SELECT * FROM ENTERPRISE";
		ModelAndView mv=new ModelAndView("viewEnterprise");
		List<Enterprise> list=new ArrayList<Enterprise>();
		try {
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(sql);
			
			Enterprise enterprise=null;
			while(result.next()) {
				enterprise=new Enterprise();
				enterprise.setGstn(result.getString(1));
				enterprise.setEnterpriseName(result.getString(2));
				enterprise.setSpoke(result.getString(3));
				enterprise.setAddress(result.getString(4));
				enterprise.setPhone(result.getString(5));
				enterprise.setEmailId(result.getString(6));
				list.add(enterprise);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DAO.closeConnection(connection);
		}
		mv.addObject("list",list);
		System.out.println(list);
		return mv;
	}
	
	@RequestMapping("viewProduct")
	public ModelAndView viewProduct()
	{
		Connection connection=DAO.getConnection();
		String sql="SELECT * FROM PRODUCT";
		ModelAndView mv=new ModelAndView("viewProduct");
		List<Product> list=new ArrayList<Product>();
		try {
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(sql);
			
			Product product=null;
			while(result.next()) {
				product=new Product();
				product.setProductName(result.getString(1));
				product.setEnterpriseGstn(result.getString(2));
				product.setProductPrice(result.getFloat(3));
				
list.add(product);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DAO.closeConnection(connection);
		}
		mv.addObject("list",list);
		System.out.println(list);
		return mv;
	}
}
