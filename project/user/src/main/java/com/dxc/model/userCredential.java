package com.dxc.model;

public class userCredential {

	private int userid;
	private String password;
	public userCredential() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userCredential(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "userCredential [userid=" + userid + ", password=" + password + "]";
	}
	
	
	
}
