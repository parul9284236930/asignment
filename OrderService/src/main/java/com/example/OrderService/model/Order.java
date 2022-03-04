package com.example.OrderService.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderService")
public class Order {

	@Id
	int oid;
	
	int cid;
	
	String productname;
	
	int price;
	
	public Order() {
		
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

	public void setproductname(String productname) {
		this.productname = productname;
	}

	public int getprice() {
		return price;
	}

	public void setComment(int price) {
		this.price = price;
	}

	public Order(int oid, int cid, String productname, int price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.productname = productname;
		this.price = price;
	}
}
