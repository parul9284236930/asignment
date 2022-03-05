package com.examples.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examples.postservice.model.CommentsDto1;
import com.examples.postservice.model.Posts1;
import com.examples.postservice.repo.PostRepo1;


@Service
public class PostServiceImpl1 implements PostService1{
	
	@Autowired
	PostRepo1 repo;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	PostFeignProxy proxy;
	
	

	@Override
	public String insertPost(Posts1 post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
		return "Post added ";
	}

	@Override
	public List<Posts1> displayAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deletePost(int postId) {
		// TODO Auto-generated method stub
		repo.deleteById(postId);
		return "Post deleted";
	}

	@Override
	public List<Posts1> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		return repo.searchPostsByAuthor(author);
	}

	@Override
	public List<Posts1> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.searchPostsByTitle(title);
	}

	@Override
	public List<CommentsDto1> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		List<CommentsDto1> comments = template.getForObject("http://COMMENT-SERVICE/comments/pid/"+pid,List.class);
		//List<CommentsDto> comments = proxy.findCommentsByPid(pid);
		return comments;
	}

}