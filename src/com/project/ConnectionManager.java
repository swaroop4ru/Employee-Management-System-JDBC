package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jfs36";
		String userName = "root";
		String password = "tiger";
		Connection connection = null;
		try {
			//loading the Driver
			Class.forName(driver);
			//Established the connection 
			connection = DriverManager.getConnection(url, userName, password);
			connection.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}

}
