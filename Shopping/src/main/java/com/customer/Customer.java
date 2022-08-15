package com.customer;

public class Customer {
	//Declaring variable
	private int id;
	private String userName;
	private String Password;
	private String Email;
	private String contactNumber;
	private String Address;
	
	
	public Customer() {
		super();
	}


	public Customer(int id, String userName, String password, String email, String contactNumber, String address) {
		super();
		this.id = id;
		this.userName = userName;
		Password = password;
		Email = email;
		this.contactNumber = contactNumber;
		Address = address;
	}
	
	


	public Customer(String userName, String password, String email, String contactNumber, String address) {
		super();
		this.userName = userName;
		Password = password;
		Email = email;
		this.contactNumber = contactNumber;
		Address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}
	


	
	
	
	
}
