package GuestBook;

public class Guest extends User {
	public Guest(){}
	
	private String alias;
	public String getAlias(){return this.alias;}
	public void setAlias(String val){this.alias=val;}
}
