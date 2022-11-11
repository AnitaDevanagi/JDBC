package com.QAC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;



public class Database {
	public static void main(String[] args) {
	         
	         add();
	}
	
	 public static void add() {
		//1.load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	    //2. get connection
			String url="jdbc:mysql://localhost:3306/company";
			String username="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, username,password);
			
        //3.create statements
			Statement statement =connection.createStatement();
			
	   //4.execute query
		 statement.execute("insert into employees values(8,'Ashita','Hydrabad',45)");
		 		
	   //5. close the connection
		connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	 

}
	   
   
