package com.allianz.shopping.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private String password;
	private String email;
	private String phoneNo;
	private String landmark;
	private String address;
	private String pinNo;
	private String city;
	List<Order> orderList = new ArrayList<Order>();

	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String password, String phoneNo, String landmark,
			String address, String pinNo, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.landmark = landmark;
		this.address = address;
		this.pinNo = pinNo;
		this.city = city;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinNo() {
		return pinNo;
	}
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", phoneNo=" + phoneNo + ", landmark=" + landmark + ", address=" + address + ", pinNo=" + pinNo
				+ ", city=" + city + "]";
	}
}