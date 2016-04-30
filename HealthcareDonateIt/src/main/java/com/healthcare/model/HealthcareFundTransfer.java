package com.healthcare.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "FUND_TRANSFER")
@NamedQuery(name="HealthcareFundTransfer.findAll", query="SELECT o FROM HealthcareFundTransfer o")
public class HealthcareFundTransfer implements Serializable{

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
	
	@Column(name="HOSPITAL_NAME")
	private String hospitalName;
	
	@Column(name="HOSPITAL_ADDRESS")
	private String hospitalAddress;
	
	@Column(name="HOSPITAL_STREET_ADDRESS")
	private String hospitalStreetAddress;
	
	@Column(name="HOSPITAL_STATE")
	private String hospitalState;
	
	@Column(name="HOSPITAL_CITY")
	private String hospitalCity;
	
	@Column(name="HOSPITAL_ZIPCODE")
	private String hospitalZipcode;
	
	@Column(name="HOSPITAL_COUNTRY")
	private String hospitalCountry;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="TRANSACTION_AMOUNT")
	private BigDecimal transactionAmount;
	
	@Column(name="TRANSACTION_STATE")
	private String transactionState;

	public HealthcareFundTransfer() {
		
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

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalStreetAddress() {
		return hospitalStreetAddress;
	}

	public void setHospitalStreetAddress(String hospitalStreetAddress) {
		this.hospitalStreetAddress = hospitalStreetAddress;
	}

	public String getHospitalState() {
		return hospitalState;
	}

	public void setHospitalState(String hospitalState) {
		this.hospitalState = hospitalState;
	}

	public String getHospitalCity() {
		return hospitalCity;
	}

	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	public String getHospitalZipcode() {
		return hospitalZipcode;
	}

	public void setHospitalZipcode(String hospitalZipcode) {
		this.hospitalZipcode = hospitalZipcode;
	}

	public String getHospitalCountry() {
		return hospitalCountry;
	}

	public void setHospitalCountry(String hospitalCountry) {
		this.hospitalCountry = hospitalCountry;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}
}
