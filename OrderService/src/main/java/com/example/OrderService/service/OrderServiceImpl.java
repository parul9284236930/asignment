package com.example.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderService.model.*;
import com.example.OrderService.repo.*;


@Service
public class OrderServiceImpl  implements OrderService{
	@Autowired
	orderRepo repo;

	@Override
	public String insertComment(order order) {
		// TODO Auto-generated method stub
		repo.save(order);
		return "Comment Added";
	}

	@Override
	public List<Object> displayAllobject() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteObject(int oid) {
		// TODO Auto-generated method stub
		repo.deleteById(oid);
		return "Comment Deleted";
	}

	@Override
	public List<Comments> searchCommentsByCommenter(String commenter) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByCommenter(commenter);
	}

	@Override
	public List<order> searchOrderByPostId(int oid) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByPostId(pid);
	}

}
