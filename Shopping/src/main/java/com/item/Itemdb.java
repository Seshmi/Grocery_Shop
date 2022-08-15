package com.item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Itemdb {
	
	public ArrayList<Item> itemdetails (String itemname) throws ClassNotFoundException{
		
		ArrayList<Item> itemdet=new ArrayList<>();
		
		//System.out.println(itemname);
		
		Class.forName("com.mysql.jdbc.Driver");
			
		try {
			
			String url="jdbc:mysql://localhost:3306/customerdb?useSSL=false";
			Connection con=DriverManager.getConnection(url,"root","WXyz98**");
			
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select *from item where category='"+itemname+"'");
		
		
		while(rs.next()) {
			
			int id=rs.getInt("id");	
			String name=rs.getString("name");
			String category=rs.getString("category");
			String price=rs.getString("price");
			String quantity=rs.getString("quantity");			
			String pic=rs.getString("pic");
			
			
			Item it=new Item(id,name,category,price,quantity,pic);
			
			itemdet.add(it);
			
			//System.out.print(pic);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return itemdet;
		}
    	
	}

