package com.QAC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
	

	public static void main(String[] args) {
		delete();
		
     }
	
	public static void delete() {
		// load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		// get connection
			String url="jdbc:mysql://localhost:3306/company";
		    String username="root";
			String password="root";
		Connection connection	= DriverManager.getConnection(url,username,password);
			
		//create statement
		    Statement statement=connection.createStatement();
		    
	   //execute Query
		    statement.execute("DELETE FROM employees WHERE id= 7");
		    
	  //close connection
		    
		    connection.close();
		  
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
