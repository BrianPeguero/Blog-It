package repositories;

import models.User;

public interface UserInt {
	
	public User getUser(String email);
	
	public User newUser(String email, String password);

}
