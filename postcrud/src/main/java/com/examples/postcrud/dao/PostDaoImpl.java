package com.examples.postcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public abstract class PostDaoImpl implements PostDao {
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String username = "root";
	String password = "root";
	static Connection con;
	static PreparedStatement pst;
	
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "ROOT";
		String password = "ROOT";
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Post> getAllPost() throws SQLException {
		// TODO Auto-generated method stub
		List<Post> posts = new ArrayList();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		while (rs.next()) {
			posts.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}

		return posts;
	}

	public String inserPost(Post posts) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into posts values(?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, posts.getPid());
		pst.setString(2, posts.getAuthor());
		pst.setString(3, posts.getTitle());
		pst.setString(4, posts.getDescription());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	public String deletePost(int pid) throws SQLException{
		String sql="delete from posts where pid=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1, pid);
		pst.executeUpdate();
		
		return "post deleted";
	}
}