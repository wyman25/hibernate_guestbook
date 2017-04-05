package GuestBook;

import java.util.Date;
import java.lang.*;

public class Message {
	private int id;
	private String title;
	private String content;
	private Date createTime;
	private Revert revert;
	private User user;
	
	public int getId(){return id;}
	public void setId(int val){this.id=val;}
	
	public  String getTitle(){return title;}
	public void setTitle(String val){this.title=val;}
	
	public String getContent(){return this.content;}
	public void setContent(String val){this.content=val;}
	
	public Date getCreateTime(){return this.createTime;}
	public void setCreateTime(Date val){this.createTime=val;}
	
	public Revert getRevert(){return this.revert;}
	public void setRevert(Revert val){this.revert=val;}
	
	public User getUser(){return this.user;}
	public void setUser(User val){this.user=val;}
}
