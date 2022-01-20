package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class CN  {
	static Connection con;
	public static Connection Createcp() throws Exception
	{
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection
		String user="root";
		String password="72028990E";
		String url="jdbc:mysql://localhost/Employee";
		
		con=DriverManager.getConnection(url, user, password);
		return con;
	}

	
	
		
	
	
	

}
