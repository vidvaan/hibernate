package com.createiq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADDR_TAB")
public class Address {
	@Id
	@Column(name = "addr_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(name = "addr_loc")
	private String aloc;
	@Column(name = "addr_mobile")
	private String amobile;
	@Column(name = "addr_mail")
	private String amail;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String aloc, String amobile, String amail) {
		super();
		this.aid = aid;
		this.aloc = aloc;
		this.amobile = amobile;
		this.amail = amail;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAloc() {
		return aloc;
	}

	public void setAloc(String aloc) {
		this.aloc = aloc;
	}

	public String getAmobile() {
		return amobile;
	}

	public void setAmobile(String amobile) {
		this.amobile = amobile;
	}

	public String getAmail() {
		return amail;
	}

	public void setAmail(String amail) {
		this.amail = amail;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + ", amobile=" + amobile + ", amail=" + amail + "]";
	}

}
