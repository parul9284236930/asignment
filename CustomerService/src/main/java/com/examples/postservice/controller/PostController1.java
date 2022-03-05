package com.examples.postservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.postservice.model.CommentsDto1;
import com.examples.postservice.model.Posts1;
import com.examples.postservice.service.PostService1;

@RestController
@RequestMapping("/posts")
public class PostController1 {
	
	@Autowired
	PostService1 service;
	
	@GetMapping("/all")
	public List<Posts1> showAll(){
		return service.displayAllPosts();
	}
	
	@PostMapping("/add")
	public String addPost(@RequestBody Posts1 post) {
		return service.insertPost(post);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletepost(@PathVariable("pid") int pid) {
		return service.deletePost(pid);
	}
	
	@GetMapping("/author/{author}")
	public List<Posts1> searchByAuthor(@PathVariable("author") String author) {
			return service.searchPostsByAuthor(author);
	}
	
	@GetMapping("/title/{title}")
	public List<Posts1> searchByTitle(@PathVariable("title") String title) {
			return service.searchPostsByTitle(title);
	}
	
	@GetMapping("/comments/{pid}")
	public List<CommentsDto1> findByPid(@PathVariable("pid")int pid){
		
		return service.searchCommentsByPid(pid);
	}

}