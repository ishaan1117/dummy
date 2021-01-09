package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.exceptions.MVCException;
import com.mvc.model.Customer;

public class CustomerDAO 
{
	
	Connection con;
	public boolean registerCustomer(Customer customer) throws MVCException
	{
		boolean result=false;
		con=new DBConnection().connectDb();
		try {
			PreparedStatement ps=con.prepareStatement("insert into Customer values(?,?,?,?,?)");
			ps.setString(1, customer.getCustId());
			ps.setString(2, customer.getCustName());
			ps.setInt(3, customer.getCustAge());
			ps.setString(4, customer.getCustMobile());
			ps.setString(5, customer.getCustCity());
			
			int res=ps.executeUpdate();
			if(res>0)
			{
				result=true;
			}

		}
		catch (SQLException e) {
			throw new MVCException(e.getMessage());
		}
		return result;
	}

}
