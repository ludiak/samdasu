package com.samdasu.da.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTime {
	@CreatedDate
	@Column(name="CREATE_DATE", updatable=false)
	private Date createDt;
	
	@LastModifiedDate
	@Column(name="MODIFY_DATE")
	private Date modifyDt;

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getModifyDt() {
		return modifyDt;
	}

	public void setModifyDt(Date modifyDt) {
		this.modifyDt = modifyDt;
	}
}
