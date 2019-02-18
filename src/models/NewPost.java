package models;

public class NewPost {
	
	private int userID;
	private String title;
	private String description;
	
	
	
	public NewPost(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public NewPost() {
	}

	
	
	
	public int getUserID() {
		return userID;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
