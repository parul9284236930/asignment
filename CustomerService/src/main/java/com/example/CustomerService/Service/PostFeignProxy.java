package com.example.CustomerService.Service;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.CustomerService.model.commiteDao;
import com.example.postservice.model.CommentsDto;

@FeignClient(name="comment-service", url="http://localhost:8082/")
public interface PostFeignProxy {
	@GetMapping("comments/pid/{pid}")
	public List<commiteDao> findCommentsByPid(@PathVariable int cid);
}
