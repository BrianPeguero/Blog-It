package models;

public class SignInUser {
	
	private String email;
	private String password;
	
	
	
	
	public SignInUser(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public SignInUser() {
	}

	
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
