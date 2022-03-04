package com.example.OrderService.repo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OrderService.service.OrderService;
import com.example.OrderService.model.*;

@Repository
@Transactional
public interface OrderServiceRepo extends JpaRepository<Order,Integer> {

	
	@Query("select c from Comments c where c.commenter=?1")
	public List<OrderService> searchCommentsByCommenter(String commenter);
	
	@Query("select c from Order c where c.oid=?1")
	public List<OrderService> searchList(int oid);
}
