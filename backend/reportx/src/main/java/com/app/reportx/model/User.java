package com.app.reportx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="emailID")
private String emailId;

@Column(name="firstname")
private String firstName;

@Column(name="lastname")
private String lastName;

@Column(name="username")
private String userName;

@Column(name="contact")
private long contact;

@Column(name="password")
private String password;

public User() {
	super();
}
public User(int id, String emailId, String firstName, String lastName, String userName, int contact, String password) {
	super();
	this.id = id;
	this.emailId = emailId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.contact = contact;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", userName=" + userName + ", contact=" + contact + ", password=" + password + "]";
}

}
