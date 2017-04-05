package GuestBook;

import java.lang.*;
import java.util.*;

public class Revert {
	private int id;
	private String content;
	private Date revertTime;
	private Message message;
	
	public int getId(){return this.id;}
	public void setId(int val){this.id=val;}
	
	public String getContent(){return this.content;}
	public void setContent(String val){this.content=val;}
	
	public Date getrevertTime(){return this.revertTime;}
	public void setrevertTime(Date val){this.revertTime=val;}
	
	public Message getMessage(){return this.message;}
	public void setMessage(Message val){this.message=val;}
}
