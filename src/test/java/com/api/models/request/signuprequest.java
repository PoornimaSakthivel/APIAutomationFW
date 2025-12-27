package com.api.models.request;

public class signuprequest {


private String username;
private String password;
private String email;
private String firstName;
private String lastName;
private int mobileNumber;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public signuprequest(String username, String password, String email, String firstName, String lastName,
		int mobileNumber) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "signuprequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
			+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
}	

public static class Bulider {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private int mobileNumber;
	
	public Bulider Username(String username) {
		this.username=username;
		return this;
	}
	public Bulider password(String password) {
		this.password=password;
		return this;
	}
	public Bulider email(String email) {
		this.email=email;
		return this;
	}
	public Bulider firstName(String firstName) {
		this.firstName=username;
		return this;
	}
	public Bulider lastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	public Bulider mobileNumber(int mobileNumber) {
		this.mobileNumber=mobileNumber;
		return this;
	}
	
	public signuprequest build(){
		signuprequest signupreq=new signuprequest(username, password,  email,firstName, lastName, mobileNumber);
		return signupreq;
	}
	public Bulider mobileNumber(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
}
