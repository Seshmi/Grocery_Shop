package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.customer.Customer;

public class LoginDB {
	public Boolean validatecustomer(Customer cus) throws ClassNotFoundException {
		
		
		//Declaring variables to,connect the database
		String dbUrl ="jdbc:mysql://localhost:3306/customerdb";
		String dbname = "root";
		String dbpassword ="WXyz98**";
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		boolean status = false;
		
		Class.forName(dbDriver);
		
		try(Connection connection = DriverManager.getConnection(dbUrl,dbname,dbpassword);
				
			PreparedStatement preparestatement = connection.prepareStatement("select * from customerdb where email =? and password=?")){
			preparestatement.setString(1,cus.getEmail());
			preparestatement.setString(2,cus.getPassword());
			
			ResultSet rs = preparestatement.executeQuery();
			status = rs.next();
	
		}catch(Exception e) { 
			System.out.print(e);
		} 
		return status;	
	}

}
