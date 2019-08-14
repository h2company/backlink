package com.backlink.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pointmember")
public class PointMember extends AbstractModel implements Serializable {

	private static final long serialVersionUID = 1284952114481547702L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "point")
	private int point;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pointMember")
	private Collection<PointLog> allPointLog;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
	private Account account;

	public PointMember() {
	}

	public PointMember(Account account, int point) {
		super();
		this.point = point;
		this.account = account;
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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
