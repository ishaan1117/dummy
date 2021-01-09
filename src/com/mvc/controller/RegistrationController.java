package com.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bo.CustomerBO;
import com.mvc.exceptions.MVCBusinessException;
import com.mvc.exceptions.MVCException;
import com.mvc.model.Customer;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Customer customer=new Customer();
		customer.setCustId(request.getParameter("custid"));
		customer.setCustName(request.getParameter("custname"));
		customer.setCustAge(Integer.parseInt(request.getParameter("custage")));
		customer.setCustMobile(request.getParameter("mobile"));
		customer.setCustCity(request.getParameter("city"));
		
		try {
			boolean res=new CustomerBO().registerCustomer(customer);
			if(res)
			{
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				request.setAttribute("custname",customer.getCustName());
				rd.forward(request, response);
				
			}
		}catch(MVCBusinessException e )
		{
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				request.setAttribute("errorReason",e.getMessage());

				rd.forward(request, response);

				
			}catch(MVCException e ) {
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				request.setAttribute("errorReason", e.getMessage());

				rd.forward(request, response);
				
				
				
			}
		


		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
