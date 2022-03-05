package com.examples.postservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.postservice.model.Posts1;


@Repository
@Transactional
public interface PostRepo1 extends JpaRepository<Posts1,Integer>{
	
	
	@Query("select p from Posts p where p.author=?1")
	public List<Posts1> searchPostsByAuthor(String author);
	
	@Query("select p from Posts p where p.title=?1")
	public List<Posts1> searchPostsByTitle(String title);

}