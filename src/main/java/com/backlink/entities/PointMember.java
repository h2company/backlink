package com.backlink.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pointmember")
public class PointMember extends AbstractModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="idlog")
	private int idlog;
	
	@Column(name="point")
	private int point;
	
	public PointMember() {}

	public PointMember(String username, int idlog, int point) {
		super();
		this.username = username;
		this.idlog = idlog;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getIdlog() {
		return idlog;
	}

	public void setIdlog(int idlog) {
		this.idlog = idlog;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
