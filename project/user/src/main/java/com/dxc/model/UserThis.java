package com.dxc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userthis")
public class UserThis {

	@Id
	private int userid;
	private String username;
	private String userpassword;
	private String usermobile;
	private long useraddeddate;
	public UserThis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserThis(int userid, String username, String userpassword, String usermobile, long useraddeddate) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.usermobile = usermobile;
		this.useraddeddate = useraddeddate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsermobile() {
		return usermobile;
	}
	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}
	public long getUseraddeddate() {
		return useraddeddate;
	}
	public void setUseraddeddate(long useraddeddate) {
		this.useraddeddate = useraddeddate;
	}
	@Override
	public String toString() {
		return "UserThis [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
				+ ", usermobile=" + usermobile + ", useraddeddate=" + useraddeddate + "]";
	}
	
	
}
