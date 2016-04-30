package com.healthcare.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AMBULANCE_REQUEST")
@NamedQuery(name="HealthcareAmbulanceRequest.findAll", query="SELECT o FROM HealthcareAmbulanceRequest o")
public class HealthcareAmbulanceRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true)
	private long id;

	@Column(name="POC_NAME")
	private String pocName;
	
	@Column(name="CONTACT_NO")
	private String contactNo;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="TO_ADDRESS")
	private String toAddress;
	
	@Column(name="TO_STREET_ADDRESS")
	private String toStreetAddress;
	
	@Column(name="TO_STATE")
	private String toState;
	
	@Column(name="TO_CITY")
	private String toCity;
	
	@Column(name="TO_ZIPCODE")
	private String toZipcode;
	
	@Column(name="TO_COUNTRY")
	private String toCountry;
	
	@Column(name="FROM_ADDRESS")
	private String fromAddress;
	
	@Column(name="FROM_STREET_ADDRESS")
	private String fromStreetAddress;
	
	@Column(name="FROM_STATE")
	private String fromState;
	
	@Column(name="FROM_CITY")
	private String fromCity;
	
	@Column(name="FROM_ZIPCODE")
	private String fromZipcode;
	
	@Column(name="FROM_COUNTRY")
	private String fromCountry;

	public HealthcareAmbulanceRequest() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
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

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getToStreetAddress() {
		return toStreetAddress;
	}

	public void setToStreetAddress(String toStreetAddress) {
		this.toStreetAddress = toStreetAddress;
	}

	public String getToState() {
		return toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getToZipcode() {
		return toZipcode;
	}

	public void setToZipcode(String toZipcode) {
		this.toZipcode = toZipcode;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getFromStreetAddress() {
		return fromStreetAddress;
	}

	public void setFromStreetAddress(String fromStreetAddress) {
		this.fromStreetAddress = fromStreetAddress;
	}

	public String getFromState() {
		return fromState;
	}

	public void setFromState(String fromState) {
		this.fromState = fromState;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getFromZipcode() {
		return fromZipcode;
	}

	public void setFromZipcode(String fromZipcode) {
		this.fromZipcode = fromZipcode;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

}
