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
import com.model.Enterprise;

@Controller
public class Add_Enterprise {

	private DBConnection DAO;
	
	@Autowired
	public Add_Enterprise(DBConnection DAO) {
		this.DAO=DAO;
	}
	
	@RequestMapping("/addEnterpriseForm")
	public ModelAndView addEnterpriseForm() {
		ModelAndView mv=new ModelAndView("addEnterpriseForm");
		return mv;
	}
	
	@RequestMapping("/addEnterprise")
	public ModelAndView addEnterprise(@ModelAttribute("enterprise")Enterprise enterprise) {
		Connection connection=DAO.getConnection();
		ModelAndView mv = null;
		try {
			Statement statement=connection.createStatement();
			String sql="INSERT INTO ENTERPRISE VALUES ('"+enterprise.getGstn()+"','"+enterprise.getEnterpriseName()+"','"+enterprise.getSpoke()+"','"+enterprise.getAddress()+"','"+enterprise.getPhone()+"','"+enterprise.getEmailId()+"')";
			boolean result=statement.execute(sql);
			DAO.closeConnection(connection);
			if(!result) {
				mv=new ModelAndView("addEnterpriseSuccess");
				mv.addObject(enterprise);
			}
			else {
				mv=new ModelAndView("addEnterpriseForm");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DAO.closeConnection(connection);
		}
		return mv;
	}
}
