package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDow {
	
	public static boolean InsertDB(Employee e1) throws Exception
	{
		boolean f=false;
		Connection con=CN.Createcp();
		String q="insert into emp(id,name,salary) values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);

		pstmt.setInt(1, e1.getId());
		pstmt.setString(2, e1.getName());
		pstmt.setFloat(3,e1.getSalary());
		//execute
		pstmt.executeUpdate();
		f=true;

		return f;
	}
	public static boolean DeleteDB(int userId) throws Exception
	{
		boolean f=false;
		Connection con=CN.Createcp();
		String q="delete from emp where id=?";
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setInt(1, userId);
		pstmt.executeUpdate();
		f=true;

		return f;
	}
	public static void showDB() throws Exception
	{
		
		Connection con=CN.Createcp();
		String q="select *from emp";
		Statement smt=con.createStatement();
		ResultSet ss=smt.executeQuery(q);
		
		while (ss.next()) {
			int id=ss.getInt("id");
			String name=ss.getString("name");
			float salary=ss.getFloat("salary");
			System.out.println(id+" "+name+" "+salary);
			
		}
		System.out.println("\n\n");
		
		
		
	}
	
	

}
