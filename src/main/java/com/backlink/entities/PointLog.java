package com.backlink.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pointlog")
public class PointLog extends AbstractModel  implements Serializable  {
	
	private static final long serialVersionUID = 7203079062723829968L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "des")
	private String des;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idMember")
	private PointMember pointMember;

	public PointLog() {
		super();
	}

	public PointLog(String des) {
		super();
		this.des = des;
	}

	public PointMember getPointMember() {
		return pointMember;
	}

	public void setPointMember(PointMember pointMember) {
		this.pointMember = pointMember;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}
