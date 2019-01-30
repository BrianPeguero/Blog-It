package enums;

public enum PostEnum {
	GET_POST_BY_ID("SELECT * FROM POST WHERE ID = ?"),
	CREATE_POST("INSERT INTO POST VALUES (?,?,?)"),
	UPDATE_POST("SELECT * FROM POST WHERE "),
	DELETE_POST("DELETE FROM POST Where id = ?");
	
	private String query;
	
	private PostEnum(String query) {
		this.query = query;
	}
	
	public String getGuery() {
		return query;
	}
	
}