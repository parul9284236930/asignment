package com.examples.postservice.service;

import java.util.List;

import com.examples.postservice.model.CommentsDto1;
import com.examples.postservice.model.Posts1;

public interface PostService1 {
	
	 public String insertPost(Posts1 post);
	 public List<Posts1> displayAllPosts();
	 public String deletePost(int postId);
	 public List<Posts1> searchPostsByAuthor(String author);
	public List<Posts1> searchPostsByTitle(String title);
	
	public List<CommentsDto1> searchCommentsByPid(int pid);
	

}