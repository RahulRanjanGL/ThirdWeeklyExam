package com.customer.restful.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customer {
	
	@Id
	private int custId;
	
	private String custLoginId;
	private String password;
	private String custName;
	private long phoneNo;
	private String address;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustLoginId() {
		return custLoginId;
	}
	public void setCustLoginId(String custLoginId) {
		this.custLoginId = custLoginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custLoginId=" + custLoginId + ", password=" + password + ", custName="
				+ custName + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	
}
