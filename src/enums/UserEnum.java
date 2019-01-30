package enums;

public enum UserEnum {
	
	GET_USER_BY_ID("SELECT * FROM POST WHERE ID = ?"),
	CREATE_USER("INSERT INTO POST VALUES (?,?,?)"),
	UPDATE_USER("SELECT * FROM POST WHERE "),
	DELETE_USER("DELETE FROM POST Where id = ?");
	
	
	private String query;
	
	private UserEnum(String query) {
		this.query = query;
	}
	
	public String getGuery() {
		return query;
	}

}
