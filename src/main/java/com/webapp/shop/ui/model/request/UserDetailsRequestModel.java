package com.webapp.shop.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message = "Name cannot be Empty")
	private String name;
	
	@NotNull(message = "Email cannot be Empty")
	@Email
	private String email;
	
	@NotNull(message = "Password cannot be Empty")
	@Size(min =5,max=16,message = "Password must be equal or greater than 8 char and less than 16 char" )
	private String password;
	
	@NotNull(message = "Mobile number cannot be Empty")
	private String mobilenumber;
	
	
	public UserDetailsRequestModel(String name, String email, String password, String mobilenumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
}
