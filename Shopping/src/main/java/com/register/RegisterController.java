package com.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Customer;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RegisterDB RDB;
	
	public void init() {
		RDB = new RegisterDB();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String contactNumber = request.getParameter("ContactNumber");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		


		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);	
		customer.setUserName(name);
		customer.setContactNumber(contactNumber);
		customer.setAddress(address);
		
		
	
		try {
			if(RDB.Register(customer)) {
				response.sendRedirect("Login.jsp");
			}
			else {
				response.sendRedirect("Registration.jsp");
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	
	}

}
