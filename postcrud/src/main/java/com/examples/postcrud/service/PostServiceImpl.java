package com.examples.postcrud.service;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.dao.PostDao;
import com.examples.postcrud.dao.PostDaoImpl;
import com.examples.postcrud.model.Posts;

public abstract class PostServiceImpl implements PostService{
	
	PostDao dao;
	
	public PostServiceImpl(){
		dao= new PostDaoImpl();
	}

	public List<Posts> getAllPosts() throws SQLException {
		// TODO Auto-generated method stub
		return ((PostServiceImpl) dao).getAllPosts();
	}

	public String inserPost(Posts posts) throws SQLException {
		// TODO Auto-generated method stub
		return dao.inserPost(posts);
	}
	public String deletePost(int pid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deletePost(pid);
}

	public PostDao getDao() {
		return dao;
	}

	public void setDao(PostDao dao) {
		this.dao = dao;
	}
}