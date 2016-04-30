package com.healthcare.dto;

import java.io.Serializable;
import java.sql.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

public class HealthcareRequestDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private long id;

	private String patientName;
	
	private String bloodGroup;
	
	private int units;
	
	private Date donationDate;
	
	private String contactNo;
	
	private String email;
	
	private String password;
	
	private String hospitalName;
	
	private String address;
	
	private String streetAddress;
	
	private String state;
	
	private String city;
	
	private String zipcode;
	
	private String country;

	public HealthcareRequestDTO() {
		
	}

	public HealthcareRequestDTO(long id, String patientName, String bloodGroup,
			int units, Date donationDate, String contactNo, String email,
			String password, String hospitalName, String address,
			String streetAddress, String state, String city, String zipcode,
			String country) {
		this.id = id;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.units = units;
		this.donationDate = donationDate;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.hospitalName = hospitalName;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
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

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
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
