package com.createiq.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.ws.soap.Addressing;

//Table(emp_tab)

// @NamedQueries(value = {
// @NamedQuery(name = "emp_find_all", query = "from Employee"),
// @NamedQuery(name = "emp_find_empid_all", query = "select eid from Employee"),
// @NamedQuery(name = "emp_find_empName_all", query = "select ename from
// Employee")
//
// })
// @NamedNativeQueries(value = {
// @NamedNativeQuery(name = "emp_count_all", query = "SELECT COUNT(*) FROM
// EMP_TAB"),
// @NamedNativeQuery(name = "emp_eid_ename_all", query = "SELECT EMP_ID,EMP_NAME
// FROM EMP_TAB")
// })
@Entity
@Table(name = "EMP_TAB")
public class Employee {
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_sal")
	private double esal;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "addr_id")
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Department department;

	public Employee(int eid, String ename, double esal, Address address, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.address = address;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", address=" + address + ", department="
//				+ department + "]";
//	}
	
	

}
