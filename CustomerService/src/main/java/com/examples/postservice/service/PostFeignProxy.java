package com.examples.postservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.examples.postservice.model.CommentsDto1;

@FeignClient(name="comment-service", url="http://localhost:8082/")
public interface PostFeignProxy {
	
	@GetMapping("comments/pid/{pid}")
	public List<CommentsDto1> findCommentsByPid(@PathVariable int pid);

}