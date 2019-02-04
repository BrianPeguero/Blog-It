package models;

public class Post {
	
	private int postId;
	private int userId;
	private String title;
	private String description;
	
	
	public Post(int postId, int userId, String title, String description) {
		this.postId = postId;
		this.userId = userId;
		this.title = title;
		this.description = description;
	}
	
	public Post() {
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getPostId() {
		return postId;
	}
	public int getUserId() {
		return userId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
