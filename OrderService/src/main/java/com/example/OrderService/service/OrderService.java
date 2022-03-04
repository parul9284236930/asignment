package com.example.OrderService.service;
import java.util.List;

import com.example.OrderService.contorller.Comments;
import com.example.OrderService.model.*;
public interface OrderService {

	public String insertOrdreService(OrderService comment);
    public List<OrderService> displayAllOrderServices();
    public String deleteOrderService(int oid);
    public List<OrderService> search(String Oredr);
	public List<OrderService> searchOrderByCustomerId(int cid);
	public List<Order> searchCommentsByCommenter(String commenter);
	List<Object> displayAllobject();
	public List<Order> searchCommentsByPostId(int pid);
}
