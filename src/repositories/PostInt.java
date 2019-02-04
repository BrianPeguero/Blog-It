package repositories;

import java.util.List;

import models.Post;

public interface PostInt {
	
	public Post getPost(int id);
	
	public List<Post> getAllPosts(int userId);
	
	public void createPost(int userId, String title, String description);
	
	public Post editPost(int userId, String title, String description);
	
	public void deletePost(int id);

	List<Post> getAllPosts();
	
}
