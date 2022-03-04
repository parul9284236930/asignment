package com.example.CustomerService.repo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CustomerService.Service.CustomerService;
import com.example.CustomerService.model.CoustomerService;

public interface CustomerServiceRepo extends JpaRepository<CoustomerService,Integer> {

	@Query("select c from customer p where p.cname=?1")
	public List<CustomerServiceRepo> searchPostsByAuthor(String cname);
	
	@Query("select c from customer p where p.caddress=?1")
	public List<CustomerServiceRepo> searchPostsByTitle(String caddress);

	public void save(CustomerService customerService);

	public List<CustomerService> searchPostsBycaddress(String caddress);

}
