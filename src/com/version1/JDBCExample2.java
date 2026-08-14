package com.version1;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample2 {
	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jfs36";
		String userName = "root";
		String password = "tiger";
		Connection connection = null;
		Statement statement = null;
		try {
			//loading the Driver
			Class.forName(driver);
			//Established the connection 
			connection = DriverManager.getConnection(url, userName, password);
			if(connection != null) {
				System.out.println("Connected!...");
			}
			// get the statement object
			statement = connection.createStatement();
			String query = "insert into employee(name, email, password, salary) values('Sai','sai@gmail.com','1234',6000.00)";
			
			//pass the sequel queries to the databases
			int count = statement.executeUpdate(query);
			//Displaying result
			if(count != 0) {
				System.out.println("Record inserted sucessfully .........");
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
