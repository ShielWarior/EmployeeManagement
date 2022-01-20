package student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.Employee;
import com.student.EmployeeDow;

public class Start {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Employee Management System");
//		Employee e1=new Employee();
		
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 for Insert DB");
			System.out.println("Press 2 for delete DB");
			System.out.println("Press 3 for Display DB");
			System.out.println("Press 4 for Exit DB");
			
			System.out.println("Enter Your Choice");
			
			int c=Integer.parseInt(b1.readLine());
			if (c==1) {
				System.out.println("****Insert Data***");
				System.out.println("Enter your Id");
				int id=Integer.parseInt(b1.readLine());
				
				System.out.println("Enter your Name");
				String name=b1.readLine();
				
				System.out.println("Enter your Salary");
				Float Salary=Float.parseFloat(b1.readLine());
				
				Employee e1=new Employee(id, name, Salary);
				
				System.out.println(e1);
				
				Boolean ans= EmployeeDow.InsertDB(e1);
				if (ans) {
					System.out.println("Inserted succeffuly");
				}else {
					System.out.println("Somethig went Wrong");
				}
			}
			else if (c==2) 
			{
				System.out.println("**Delete Data**");
				System.out.println("Enter Id to delete");
				int userId=Integer.parseInt(b1.readLine());
				EmployeeDow.DeleteDB(userId);
				
				
				
			}
			else if (c==3) 
			{
				System.out.println("\nDisplay Data");
				EmployeeDow.showDB();
				
			}
			else if (c==4) 
			{
				break;
				
			}
		}
		
		
		
		
		

	}

}
