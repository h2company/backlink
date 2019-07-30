package com.backlink.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.backlink.helper.StringHelper;

@Entity
@Table(name = "account")
public class Account extends AbstractModel {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "md5")
	private String md5;

	@Column(name = "hash")
	private String hash;

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
		this.password = password;
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.hash = StringHelper.randomAlphaNumeric(8);
		this.md5 = "123";
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

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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
