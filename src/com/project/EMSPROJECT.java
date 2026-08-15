package com.project;
import java.util.Scanner;
public class EMSPROJECT {
	public static void main(String[] args) {
		
		 Scanner obj = new Scanner(System.in);
		 EmployeeDAO dao = new EmployeeDAO();
		 
		 while(true) {
			 System.out.println("*****************************************");
			 System.out.println("*****************************************");
			 System.out.println("********Employee Management System*******");
			 System.out.println("***********1. Add Employee***************");
			 System.out.println("***********2. View Employees*************");
			 System.out.println("***********3. Search Employee************");
			 System.out.println("***********4. Update Salary**************");
			 System.out.println("***********5. Update Email***************");
			 System.out.println("***********6. Delete Employee************");
			 System.out.println("***********7. EXIT***********************");
			 System.out.println("*****************************************");
			 System.out.println("*****************************************");
			 int choice = obj.nextInt();
			 switch(choice) {
			 
			 case 1:
				 System.out.println("Enter your name");
				 String name = obj.next();
				 System.out.println("Enter your Email");
				 String email = obj.next();
				 System.out.println("Enter your Password");
				 String password = obj.next();
				 System.out.println("Enter your Salary");
				 double salary = obj.nextDouble();
				 dao.addEmployee(name, email, password, salary);
				 break;
			 case 2:
				 dao.viewAllEmployees();
				 break;
			 case 3:
				 System.out.println("Enter id");
				 int id = obj.nextInt();
				 dao.searchEmployee(id);
				 break;
			 case 4:
				 System.out.println("Enter id");
				 id = obj.nextInt();
				 System.out.println("Enter your salary");
				 salary = obj.nextDouble();
				 dao.updateSalary(id,salary);
				 break;
			 case 5:
				 System.out.println("Enter id");
				 id = obj.nextInt();
				 System.out.println("Enter your Email");
				  email = obj.next(); 
				  dao.updateEmail(id, email);
				  break;
			 case 6:
				 System.out.println("Enter id");
				 id = obj.nextInt();
				 dao.deleteEmployee(id);
				 break;
			 case 7 :
				 System.out.println("TQS");
				 return; 
				 
			 }
			 
			 
		 }

	}

}
