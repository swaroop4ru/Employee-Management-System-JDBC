package com.version1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {
	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "tiger";
		Connection connection = null;
		try {
			//loading the Driver
			Class.forName(driver);
			//Established the connection 
			connection = DriverManager.getConnection(url, userName, password);
			if(connection != null) {
				System.out.println("Connected!...");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
