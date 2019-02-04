package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DAO;
import enums.UserEnum;
import models.Post;
import models.User;
import repositories.UserInt;

public class UserImp extends DAO implements UserInt {

	@Override
	public User getUser(String email) {
		User user = null;
		connect();
		
		try {
			ps = conn.prepareStatement(UserEnum.GET_USER_BY_EMAIL.getQuery());
			ps.setString(1, email);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		return user;
	}

	@Override
	public void newUser(String email, String password) {
		connect();
		
		try {
			ps = conn.prepareStatement(UserEnum.GET_USER_BY_EMAIL.getQuery());
			ps.setString(1, email);
			ps.setString(2, password);
			
			ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
	}

	@Override
	public boolean validateUser(String email, String password) {
		boolean isValid = false;
		User dbUser = null;
		connect();
		
		try {
			ps = conn.prepareStatement(UserEnum.GET_USER_BY_EMAIL.getQuery());
			
			if(rs.next()) {
				dbUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		if (dbUser.getEmail().equals(email) && dbUser.getPassword().equals(password)) {
			isValid = true;
		}
		
		return isValid;
	}

	@Override
	public List<Post> getAllPosts(int userId) {
		List<Post> listOfPosts = new ArrayList<Post>();
		
		try {
			ps = conn.prepareStatement(UserEnum.GET_USERS_POSTS.getQuery());
			
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

}
