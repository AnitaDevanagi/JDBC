package com.QAC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Update { 
   public static void main(String[] args) {
	   update();
}
   
   
   public static void update() {
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url, username, password);
		
		Statement statement  =connection.createStatement();
		
		statement.executeUpdate("UPDATE employees SET name='Adhi' WHERE id=5");
		
		connection.close();
		
	   } catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
   }
   }


