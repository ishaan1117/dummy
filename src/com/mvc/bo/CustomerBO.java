package com.mvc.bo;

import java.sql.Connection;

import com.mvc.dao.CustomerDAO;
//import com.mvc.dao.*;
import com.mvc.exceptions.MVCBusinessException;
import com.mvc.exceptions.MVCException;
import com.mvc.model.Customer;

public class CustomerBO {
	
	
	public boolean registerCustomer(Customer customer) throws MVCBusinessException,MVCException 
	{
		if(customer.getCustAge()<18)
			throw new MVCBusinessException("Invalid Customer Age");
		else if(customer.getCustMobile().length()!=10)
			throw new MVCBusinessException("Invalid mobile no");
		return new CustomerDAO().registerCustomer(customer);
			
		
		
	}
	

}
