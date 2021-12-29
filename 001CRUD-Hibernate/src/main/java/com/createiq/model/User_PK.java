package com.createiq.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_PK implements Serializable {
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;

	public User_PK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_PK(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "User_PK [fname=" + fname + ", lname=" + lname + "]";
	}

}
