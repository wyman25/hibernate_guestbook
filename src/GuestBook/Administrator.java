package GuestBook;

public class Administrator extends User {
	private String role;
	public String getRole(){
		return role;
	}
	public void setRole(String val){
		this.role=val;
	}
}
