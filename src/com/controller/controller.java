package com.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.dao.DBConnection;
import com.model.LoginDetails;

@Controller
public class controller {
public controller() {
	System.out.println("In Controller Constructor");
}
	private DBConnection DAO;

	@Autowired
	public controller(DBConnection DAO) {
		this.DAO=DAO;
	System.out.println("controller Constructor");
	}

	@RequestMapping("/validate")
	public ModelAndView check(@ModelAttribute("loginDetails")LoginDetails loginDetails)
	{
		System.out.println(loginDetails.getUsername()+" "+loginDetails.getPassword());
//
		Connection connection=DAO.getConnection();


		Statement statement;
		try {
			statement = connection.createStatement();
			String sql="select * from login";
			ResultSet result=statement.executeQuery(sql);
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2));
			}
			DAO.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModelAndView mv=new ModelAndView("welcome");
		mv.addObject(loginDetails);
		return mv;
	}
}
