package com.mvc.dao;
import java.sql.*;

import com.mvc.exceptions.MVCException;
public class DBConnection {
	
	public Connection connectDb() throws MVCException
	{
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			//con = DriverManager.getConnection("jdbc:mysql:thin:@localhost:3306:mydb","root","root");
		//	con = DriverManager.getConnection("jdbc:mysql@localhost:3306:mydb","root","root");
			System.out.print("success");
			
			}
		catch(Exception e) {
			throw new MVCException("connection error"+ e.getMessage());
			
		}
		return con;
	}
	
}
