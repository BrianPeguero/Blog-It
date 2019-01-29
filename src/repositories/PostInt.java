package repositories;

import java.util.List;

import models.Post;

public interface PostInt {
	
	public Post getPost(int id);
	
	public List<Post> getAllPosts();
	
	public Post createPost(String title, String descripton);
	
	public Post editPost(String title, String descripton);
	
	public void deletePost(int id);
	
}
