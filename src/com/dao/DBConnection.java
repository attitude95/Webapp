package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	//Declaring variable.
	private Connection connection;
	
	//Constructor of DBConnection
	public DBConnection() {
		System.out.println("DBConnection Constructor");
	}
	
	//Getter of Connection
    public Connection getConnection() {

		  // Create a variable for the connection string.  
	      String connectionUrl = "jdbc:sqlserver://kalamkari.database.windows.net:1433;database=vutukurileelaprasaddyesandchemicals;user=chanduv360@kalamkari;password=Chandu_8055;encrypt=true;trustServerCertificate=false;hostNameInCertificate=southeastasia1-a.control.database.windows.net;loginTimeout=30;";  
	      
	    try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(connectionUrl);
			System.out.println("test");
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		
    	return connection;
    }

    //Closing Connection
    public void closeConnection(Connection connection) {
    	try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
