package com.createiq.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tab")
public class User implements Serializable {
	@EmbeddedId
	private User_PK user_PK;

	@Column(name = "user_age")
	private double uage;

	public User(User_PK user_PK, double uage) {
		super();
		this.user_PK = user_PK;
		this.uage = uage;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_PK getUser_PK() {
		return user_PK;
	}

	public void setUser_PK(User_PK user_PK) {
		this.user_PK = user_PK;
	}

	public double getUage() {
		return uage;
	}

	public void setUage(double uage) {
		this.uage = uage;
	}

	@Override
	public String toString() {
		return "User [user_PK=" + user_PK + ", uage=" + uage + "]";
	}

}
