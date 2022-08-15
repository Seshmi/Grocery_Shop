package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.Customer;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDB LDB;
	
	public void init() {
		LDB = new LoginDB();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("userName");
		String pw = request.getParameter("Password");
		
		Customer cus = new Customer();
		cus.setEmail(un);
		cus.setPassword(pw);		
		try {
			if(LDB.validatecustomer(cus)) {
				HttpSession session = request.getSession();
				session.setAttribute("userName",un);
				response.sendRedirect("home logout.jsp");
			}
			else {
				response.sendRedirect("Login.jsp");
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	
	}

}
