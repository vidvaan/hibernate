package com.createiq.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRO_TAB")
public class Project {
	@Id
	@Column(name = "pro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(name = "pro_name")
	private String pname;
	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + "]";
	}

}
