package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.customer.Customer;

public class Dataloader {
	


	public Customer loadData (String email) throws ClassNotFoundException  {
		
		String dbUrl ="jdbc:mysql://localhost:3306/customerdb";
		String dbname = "root";
		String dbpassword ="WXyz98**";
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		Customer customer = new Customer();
		
		Class.forName(dbDriver);
		
		
		
		try(Connection connection = DriverManager.getConnection(dbUrl,dbname,dbpassword);
				
				
				
				PreparedStatement preparestatement = connection.prepareStatement("select * from customerdb where email=?")){
				preparestatement.setString(1,email);
				
							
				ResultSet rs = preparestatement.executeQuery();
				while( rs.next()) {
					String name = rs.getString("userName");
					String password = rs.getString("Password");
					String Email = rs.getString("Email");
					String contactNumber = rs.getString("contactNumber");
					String address = rs.getString("Address");
					customer = new Customer(name,password,Email,contactNumber,address);
					
				}
				
				
		
				
		}catch(Exception e) {
			
			System.out.print(e);
		}
				
		return customer;
	}

}
