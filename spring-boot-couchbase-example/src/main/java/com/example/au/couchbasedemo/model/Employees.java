package com.example.au.couchbasedemo.model;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class Employees {
	
	@Id
	private String empId;
	@NotNull
	@Field
	private String empName;

	@Field
	private String address;
	@NotNull
	@Field
	private String pincode;


	public Employees(String empId, String empName, String address, String pincode) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.pincode = pincode;

	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
