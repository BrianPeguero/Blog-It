package models;

import java.util.List;

public class User {
	
	private String email;
	private String password;
	
	private List<Integer> posts;
	
	
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public List<Integer> getPosts() {
		return posts;
	}
	public void setPosts(List<Integer> posts) {
		this.posts = posts;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
