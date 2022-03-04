package com.example.OrderService.contorller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.OrderService.model.*;
	import com.example.OrderService.service.*;


	@RestController
	@RequestMapping("/comments")
	public class OrderServiceContorller {
		
		@Autowired
		OrderService service;
		
		@GetMapping("/all")
		public List<Object> showAll(){
			return service.displayAllobject();
		}
		
		@PostMapping("/add")
		public String addComment(@RequestBody OrderService comment) {
			return service.insertOrdreService(comment);
		}
		
		@DeleteMapping("/delete/{cid}")
		public String deletepost(@PathVariable("cid") int cid) {
			return service.deleteOrderService(cid);
		}
		
		@GetMapping("/commenter/{name}")
		public List<Order> searchByCommenter(@PathVariable("name") String commenter) {
				return service.searchCommentsByCommenter(commenter);
		}
		
		@GetMapping("/pid/{pid}")
		public List<Order> searchByPid(@PathVariable("pid") int pid) {
				return service.searchCommentsByPostId(pid);
		}

}
