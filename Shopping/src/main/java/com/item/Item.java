package com.item;

public class Item {

	private int id;
	private String name;
	private String catgory;
	private String price;
	private String quantity;
	private String pic;
	
	public Item() {
		super();
	}

	public Item(int id, String name, String catgory, String price, String quantity, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.catgory = catgory;
		this.price = price;
		this.quantity = quantity;
		this.pic = pic;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcatgory() {
		return catgory;
	}

	public void setcatgory(String catgory) {
		this.catgory = catgory;
	}

	public String getprice() {
		return price;
	}

	public void setprice(String price) {
		this.price = price;
	}

	public String getquantity() {
		return quantity;
	}

	public void setquantity(String quantity) {
		this.quantity = quantity;
	}

	public String getpic() {
		return pic;
	}

	public void setpic(String pic) {
		this.pic = pic;
	}
	
	
}
