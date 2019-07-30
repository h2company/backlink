package com.backlink.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.mindrot.jbcrypt.BCrypt;

import com.backlink.helper.StringHelper;

@Entity
@Table(name = "account")
public class Account extends AbstractModel {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private int role;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	public Account() {

	}

	public Account(String username, String password, int role, String email, String phone) {
		super();
		this.username = username;
		this.password = BCrypt.hashpw(password, BCrypt.gensalt(10));
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.createAt = new Date();
		this.updateAt = new Date();
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
