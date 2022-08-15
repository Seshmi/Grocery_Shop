package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.customer.Customer;

public class ForgotDB {

	public static int ForgetPassword(Customer cus) throws ClassNotFoundException {
		
		String dbUrl ="jdbc:mysql://localhost:3306/customerdb";
		String dbname = "root";
		String dbpassword ="WXyz98**";
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		
		
		Class.forName(dbDriver);
		
		int Result=0;
		try(Connection connection =  DriverManager.getConnection(dbUrl,dbname,dbpassword);
				PreparedStatement preparestatement = connection.prepareStatement("update Customerdb set password=? where email=?")){
			preparestatement.setString(2,cus.getEmail());
			preparestatement.setString(1,cus.getPassword());
			
			Result = preparestatement.executeUpdate();
		
		}catch(Exception e) { 
			System.out.print(e);
		} 
				
		return Result;
		
	}

}
