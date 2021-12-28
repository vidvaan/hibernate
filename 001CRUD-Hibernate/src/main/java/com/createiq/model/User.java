package com.createiq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tab")
public class User {
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name = "user_name")
	private String uname;
	@Column(name = "user_age")
	private double uage;

	public User(int uid, String uname, double uage) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public double getUage() {
		return uage;
	}

	public void setUage(double uage) {
		this.uage = uage;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
	}

}
