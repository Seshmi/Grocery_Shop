package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.customer.Customer;

public class DeleteDB {
	
	
	public static int DeleteAccount(Customer cus) throws ClassNotFoundException {
		
		String dbUrl ="jdbc:mysql://localhost:3306/customerdb";
		String dbname = "root";
		String dbpassword ="WXyz98**";
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		
		
		Class.forName(dbDriver);
		
		int Result=0;
		try(Connection connection =  DriverManager.getConnection(dbUrl,dbname,dbpassword);
				PreparedStatement preparestatement = connection.prepareStatement("Delete from customerdb where email=? ")){
			preparestatement.setString(1,cus.getEmail());
			
			
			Result = preparestatement.executeUpdate();
		
		}catch(Exception e) { 
			System.out.print(e);
		} 
				
		return Result;
		
	}


}
