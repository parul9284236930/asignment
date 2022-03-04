package com.example.CustomerServices.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerServices.model.Customer;
import com.example.CustomerServices.service.CustomerService;

@RestController
@RequestMapping("/Customers")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.displayAllCustomer();
	}
	
	@PostMapping("/add/{Customer}")
	public String addCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	
	@GetMapping("/CustomerId/{cid}")
	public List<Customer> searchByCustomer(@PathVariable("cid") int Customer) {
			Object cid=null;
			return service.findByID(cid);
	}
	
	@GetMapping("/CustomerName/{cname}")
	public List<Customer> searchByCustomerName(@PathVariable("cname") String Customer) {
			Object cname = null;
			return service.findByName(cname);
	}
	
	
	@GetMapping("/CustomerAddress/{caddress}")
	public List<Customer> searchByCustomerAddress(@PathVariable("caddress") String Customer) {
			Object caddress = null;
			return service.findByAddress(caddress);
}
}