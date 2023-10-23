package com.example.Clinical.Data_On;

import org.springframework.stereotype.Component;

@Component
public class Data_Entity {

	


	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDoctor() {
		return doctor;
	}
	public String getAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}
	public String getFle() {
		return fle;
	}
	public String getImage() {
		return image;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setFle(String fle) {
		this.fle = fle;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String name;
	private String email;

	private String doctor;
	private String address;

	
	private String contact;
	private String fle;
	private String image;
	
	
	
	
}
