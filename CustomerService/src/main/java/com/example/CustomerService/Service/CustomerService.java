package com.example.CustomerService.Service;
import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;

import com.example.CustomerService.model.commiteDao;
import com.example.CustomerService.repo.CustomerServiceRepo;
public interface CustomerService {
	public String insertPost(CustomerService post);
	 public List<CustomerService> displayAllPosts();
	 public String deletePost(int cid);
	 public List<CustomerService> searchPostsByAuthor(String author);
	public List<CustomerService> searchPostsByTitle(String title);
	
	public List<OrderDto> searchCommentsByPid(int pid);
	public List<commiteDao> searchOrderBycid(int cid);
}
