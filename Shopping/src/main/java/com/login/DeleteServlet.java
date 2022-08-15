package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Customer;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email = request.getParameter("email");
		
		Customer customer = new Customer();
		customer.setEmail(email);
		
		
		int abc=0;
		try {
			abc=DeleteDB.DeleteAccount(customer);
		}catch(Exception e) {
			System.out.print(e);
		}
		if(abc==1) {
			response.sendRedirect("Login.jsp");
		}else {
			response.sendRedirect("Delete.jsp");
		}
	}
}
