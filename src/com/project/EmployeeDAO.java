package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDAO {
	
	Connection connection = null;
	
	public void addEmployee(String name, String email, String password, double salary) {
		connection = ConnectionManager.getConnection();
		String query ="insert into employee(name, email, password, salary)values(?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, password);
			statement.setDouble(4,salary);
			
			int count = statement.executeUpdate();
			if(count != 0) {
				connection.commit();
				System.out.println("Record insert Successfully!....");
			}else {
				connection.rollback();
				System.out.println("Error in adding employee details");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void viewAllEmployees() {
		Connection connection = ConnectionManager.getConnection();
		try {
			connection.setAutoCommit(true);
			String query = "select *from employee";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet set = statement.executeQuery();
			while(set.next()) {
				System.out.print(set.getInt(1)+" ");
				System.out.print(set.getString(2)+" ");
				System.out.print(set.getString(3)+" ");
				System.out.print(set.getString(4)+" ");
				System.out.print(set.getDouble(5)+" ");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
