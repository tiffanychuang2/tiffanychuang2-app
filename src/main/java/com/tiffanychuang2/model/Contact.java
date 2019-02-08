package com.tiffanychuang2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

//import org.springframework.data.annotation.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	@Lob
	private String comments;
	
//	Constructors
	public Contact(String firstName, String lastName, String email, String phoneNumber, String comments) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.comments = comments;
	}
	
//	Getters
	public Long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getComments() {
		return comments;
	}
	
//	Setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + email + ", " + phoneNumber + ", " + comments; 
	}
	
}
