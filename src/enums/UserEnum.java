package enums;

public enum UserEnum {
	
	GET_USER_BY_EMAIL("SELECT * FROM USERS WHERE EMAIL = ?"),
	
	GET_USERS_POSTS("SELECT * FROM POSTS JOIN USERS ON USERS.USER_ID = POSTS.USER_ID WHERE USER_ID = ?"),
	
	
	CREATE_USER("INSERT INTO USERS (USER_ID, EMAIL, PASSWORD) VALUES (seq_user.nextval, ?, ?)"),
	DELETE_USER("DELETE FROM USERS Where EMAIL = ?");
	
	
	private String query;
	
	private UserEnum(String query) {
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}

}
