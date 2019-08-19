package com.backlink.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class AbstractModel{
	
	@Column(name = "isDeleted")
	protected boolean deleted = false;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createAt")
	protected Date createAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateAt")
	protected Date updateAt;

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

}
