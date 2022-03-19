package com.webapp.shop.ui.model;

public class UserRest {
	
	private Integer user_id;
	private String user_name;
	private String email;
	private String password;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRest [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", password="
				+ password + "]";
	}
	

}
