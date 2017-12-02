package com.model;

public class LoginDetails {

	private String username;
	private String password;
	
	
	
	public LoginDetails() {
		System.out.println("LoginDetails NO parameters");

	}
	public LoginDetails(String username, String password) {
		System.out.println("LoginDetails");
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
