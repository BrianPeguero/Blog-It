package enums;

public enum PostEnum {
	GET_POST_BY_ID("SELECT * FROM POSTS WHERE ID = ?"),
	GET_POSTS_BY_USER_ID("SELECT * FROM POSTS WHERE USER_ID = ?"),
	
	CREATE_POST("INSERT INTO POSTS (POST_ID, USER_ID, TITLE, DESCRIPTION) VALUES (seq_post.nextval,?,?,?)"),
	UPDATE_POST("SELECT * FROM POSTS WHERE "),
	DELETE_POST("DELETE FROM POSTS Where id = ?");
	
	private String query;
	
	private PostEnum(String query) {
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
	
}