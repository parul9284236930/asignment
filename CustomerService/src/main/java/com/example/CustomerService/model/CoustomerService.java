package com.example.CustomerService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coustomer")
public class CoustomerService {
	@Id
	int cid;
	String cname;
	String caddress;
	

	public CoustomerService() {

	}

	public CoustomerService(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	
	}

	public int getcid() {
		return cid;
	}

	public void setcid(int pid) {
		this.cid = cid;
	}

	public String getAuthor() {
		return cname;
	}

	public void setcname(String cname) {
		this.cname = cname;
	}

	public String getcaddress() {
		return caddress;
	}

	public void setcaddress(String caddress) {
		this.caddress = caddress;
	}

	


}
