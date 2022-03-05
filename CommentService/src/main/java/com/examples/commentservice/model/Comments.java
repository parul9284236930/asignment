package com.example.CustomerServices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Customer {

	@Id
	int cid;
	String cname;
	String caddress;
	

	public Customer() {

	}

	public Customer(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		
	}

	public int getcid() {
		return cid;
	}

	public void setcid(int cid) {
		this.cid = cid;
	}

	public String getcname() {
		return cname;
	}

	public void setcname(String cname) {
		this.cname = cname;
	}

	public String getcaddress() {
		return caddress;
	}

}