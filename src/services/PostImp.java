package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DAO;
import enums.PostEnum;
import models.Post;
import repositories.PostInt;

public class PostImp extends DAO implements PostInt {

	@Override
	public Post getPost(int id) {
		Post post = null;
		connect();
		
		try {
			ps = conn.prepareStatement(PostEnum.GET_POST_BY_ID.getQuery());
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				post = new Post(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		return post;
	}
	
	@Override
	public List<Post> getAllPosts(int userId) {
		List<Post> listOfPosts = new ArrayList<Post>();
		
		try {
			ps = conn.prepareStatement(PostEnum.GET_POSTS_BY_USER_ID.getQuery());
			
			ps.setInt(1, userId);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				listOfPosts.add(new Post(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		return listOfPosts;
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPost(int userId, String title, String description) {
		connect();
		
		try {
			ps = conn.prepareStatement(PostEnum.CREATE_POST.getQuery());
			ps.setInt(1, userId);
			ps.setString(2, title);
			ps.setString(3, description);
			
			ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
	}

	@Override
	public Post editPost(int userId, String title, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(int id) {
		// TODO Auto-generated method stub

	}

}
