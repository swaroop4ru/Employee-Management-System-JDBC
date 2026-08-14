package com.version1;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample3 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jfs36";
		String userName = "root";
		String password = "tiger";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			//loading the Driver
			Class.forName(driver);
			//Established the connection 
			connection = DriverManager.getConnection(url, userName, password);
			if(connection != null) {
				System.out.println("Connected!...");
			}
			
			String query = "insert into employee(name, email, password, salary) values(?,?,?,?)";
			// get the statement object
			statement = connection.prepareStatement(query);
			
			System.out.println("Enter name : ");
			statement.setString(1,obj.next());
			System.out.println("Enter Email : ");
			statement.setString(2,obj.next());
			System.out.println("Enter password : ");
			statement.setString(3,obj.next());
			System.out.println("Enter salary : ");
			statement.setDouble(4,obj.nextDouble());
			
			
			//pass the sequel queries to the databases
			int count = statement.executeUpdate();
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
