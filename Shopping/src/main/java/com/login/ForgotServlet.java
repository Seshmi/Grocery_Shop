package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Customer;

@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password =request.getParameter("pass");
		
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
		
		int abc=0;
		try {
			abc=ForgotDB.ForgetPassword(customer);
		}catch(Exception e) {
			System.out.print(e);
		}
		if(abc==1) {
			response.sendRedirect("Profile.jsp");
		}else {
			response.sendRedirect("Forgotpassword.jsp");
		}
	}	
}
