package com.expensetracker;

public class UserCredntials {
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserCredntials() {
		// TODO Auto-generated constructor stub
	}
	
	public UserCredntials(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredntials [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
