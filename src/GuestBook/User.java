package GuestBook;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	public int getId(){return this.id;}
	public void setId(int val){this.id=val;}
	
	public String getUsername(){return this.username;}
	public void setUsername(String val){this.username=val;}
	
	public String getPassword(){return this.password;}
	public void setPassword(String val){this.password=val;}
	
	public String getEmail(){return this.username;}
	public void setEmail(String val){this.email=val;}
}
