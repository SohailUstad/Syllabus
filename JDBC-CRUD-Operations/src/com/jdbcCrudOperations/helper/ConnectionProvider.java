package com.jdbcCrudOperations.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private Connection connection;
	
	public Connection getConnection() {
		
		try {
			//Database Credentials
			String url="jdbc:mysql://localhost:3306/studentsdb";
			String username="root";
			String password="0000";
			
			//Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Get the connection from DriverManager
			this.connection=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.connection;
	}
}
