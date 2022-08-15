package com.item;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ItemServlet")
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String category=request.getParameter("category");
			
			
			//System.out.print(itemn);
			
			
		Itemdb searchitem =new Itemdb();
		ArrayList<Item> itemdetails = searchitem.itemdetails(category);
		
		request.setAttribute("itemname", itemdetails);
		
		//System.out.print(list.get(0));
		//System.out.print(list.get(1));
		
		RequestDispatcher dis = request.getRequestDispatcher("categoryview.jsp");
		dis.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
