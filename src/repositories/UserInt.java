package repositories;

import java.util.List;

import models.Post;
import models.User;

public interface UserInt {
	
	public User getUser(String email);
	
	public void newUser(String email, String password);
	
	public boolean validateUser(String email, String password);

	public List<Post> getAllPosts(int userId);

}
