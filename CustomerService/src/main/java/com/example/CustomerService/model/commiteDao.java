package com.example.CustomerService.model;

public class commiteDao {
	int oid;
	
	int cid;
	
	String productname;
	
	String price;
	
	public commiteDao() {
		
	}

	public int getoid() {
		return oid;
	}

	public void setoid(int oid) {
		this.oid = oid;
	}

	public int getcid() {
		return cid;
	}

	public void setcid(int cid) {
		this.cid = cid;
	}

	public String getproductname() {
		return productname;
	}

	public void setprice(String price) {
		this.price = price;
	}

	public String getprice() {
		return price ;
	}

	
	

	public commiteDao(int oid, int cid, String product, String price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.productname = productname;
		this.price = price;
	}
	


}
