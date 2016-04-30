package com.healthcare.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class HealthcareDonorDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private long id;

	private String donorName;
	
	private String bloodGroup;
	
	private String contactNo;
	
	private String email;
	
	private String password;
	
	private String address;
	
	private String streetAddress;
	
	private String state;
	
	private String city;
	
	private String zipcode;
	
	private String country;

	public HealthcareDonorDTO() {
		
	}

	public HealthcareDonorDTO(long id, String donorName, String bloodGroup,
			String contactNo, String email, String password, String address,
			String streetAddress, String state, String city, String zipcode,
			String country) {
		this.id = id;
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.address = address;
		this.streetAddress = streetAddress;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
