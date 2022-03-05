package com.examples.commentservice.service;
import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

import com.example.CustomerServices.model.Customer;
import com.examples.commentservice.repo.CommentsRepo;


	@Service
	public class CommentServiceImpl implements CustomerService{
		
		@Autowired
		 CommentsRepo repo;
		
		@Autowired
		RestTemplate template;

		@Override
		public String insertCustomer(Customer customer) {
			// TODO Auto-generated method stub
			repo.save(customer);
			
			return "Customer added ";
		}

		public List<Customer> displayAllCustomer() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}

		public String deleteCustomer(int CustomerId) {
			// TODO Auto-generated method stub
			repo.deleteById(CustomerId);
			return "Post deleted";
		}

		public List<Customer> searchCustomerByName(String name) {
			// TODO Auto-generated method stub
			return repo.searchCustomerByName(name);
		}

		public List<Customer> searchCustomerByAddress(String caddress) {
			// TODO Auto-generated method stub
			return repo.searchCustomerByAddress(caddress);
		}

		@Override
		public List<Comment> searchCommentsBycid(int cid) {
			// TODO Auto-generated method stub
			List<Comment> comments = template.getForObject("http://COMMENT-SERVICE/comments/cid/"+cid,List.class);
			return comments;
		}

		@Override
		public List<Customer> displayAllPosts() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String deletePost(int postId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> searchPostsBycname(String cname) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> searchPostsBycaddress(String caddress) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> searchPostsByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> searchCustomerBycaddress(String caddress) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> findByName(Object cname) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> findByID(Object cid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> findByAddress(Object caddress) {
			// TODO Auto-generated method stub
			return null;
		}

	}