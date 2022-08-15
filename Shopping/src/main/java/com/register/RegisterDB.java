package com.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.customer.Customer;

public class RegisterDB {
	public Boolean Register (Customer customer) throws ClassNotFoundException {
		
		//Declaring variables to,connect the database
		String dbUrl ="jdbc:mysql://localhost:3306/customerdb";
		String dbname = "root";
		String dbpassword ="WXyz98**";
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		Boolean status = false;
		
		Class.forName(dbDriver);
		
		try(Connection connection = DriverManager.getConnection(dbUrl,dbname,dbpassword);
				
			PreparedStatement preparestatement = connection.prepareStatement("insert into Customerdb(username,password,email,contactNumber,address) values(?,?,?,?,?)")){
			preparestatement.setString(1,customer.getUserName());
			preparestatement.setString(2,customer.getPassword());
			preparestatement.setString(3,customer.getEmail());
			preparestatement.setString(4,customer.getContactNumber());
			preparestatement.setString(5,customer.getAddress());
			
			 preparestatement.executeUpdate();
			 status = true;
			
		}catch(Exception e) { 
			System.out.print(e);
		} 
		return status;	
	}

				
			
		
		
		
	}
	


