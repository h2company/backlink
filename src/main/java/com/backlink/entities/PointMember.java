package com.backlink.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pointmember")
	private Collection<PointLog> allPointLog;
	
	public PointMember() {}

	public PointMember(String username, int idlog, int point) {
		super();
		this.username = username;
		this.idlog = idlog;
		this.point = point;
	}

	public Collection<PointLog> getAllPointLog() {
		return allPointLog;
	}

	public void setAllPointLog(Collection<PointLog> allPointLog) {
		this.allPointLog = allPointLog;
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
