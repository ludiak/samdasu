package com.samdasu.da.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
public class Member extends BaseTime implements Serializable {
	private static final long serialVersionUID = -7341155532487259937L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seq;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ROLES")
	private String roles;
	
	public Member() {
		
	}
	
	public Member(String userId, String pass, String name, String roles) {
		this.userId = userId;
		this.password = pass;
		this.name = name;
		this.roles = roles;		
	}
	
	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
}
