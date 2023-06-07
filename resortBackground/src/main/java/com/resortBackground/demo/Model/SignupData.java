package com.resortBackground.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class SignupData {
	@Id
	private String username;
	private String email;
	private String Password;
	private String mobile;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
