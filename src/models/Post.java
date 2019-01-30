package models;

import java.util.Date;

public class Post {
	
	private String title;
	private String description;
	private Date date;
	
	
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public Date getDate() {
		return date;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
