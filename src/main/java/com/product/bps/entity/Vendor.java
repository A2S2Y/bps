package com.product.bps.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="vendor_id")
	private Long vendorId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_registration_number")
	private int companyRegistrationNumber;
	private String website;
	@Column(name="certificate_issue_date")
	private Date certificateIssueDate;
	@Column(name="certificate_validity_date")
	private Date certificateValidityDate;
	@Column(name="employee_count")
	private int employeeCount;
	@Column(name="customer_count")
	private int customerCount;
	@Column(name="years_of_service")
	private int yearsOfService;
	@Column(name="year_of_establishment")
	private Date yearOfEstablishment;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="mail_id")
	private String mailId;
	private String state;
	private String country;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="vendor_type_id", unique=true)
	private VendorType vendorTypeId;
	
	@Column(name="card_number")
	private String cardNumber;
	private float balance;
	
	@ManyToOne
	@JoinColumn(name="administrator_id", unique=true)
	private Administrator administrator;

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(int companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getCertificateIssueDate() {
		return certificateIssueDate;
	}

	public void setCertificateIssueDate(Date certificateIssueDate) {
		this.certificateIssueDate = certificateIssueDate;
	}

	public Date getCertificateValidityDate() {
		return certificateValidityDate;
	}

	public void setCertificateValidityDate(Date certificateValidityDate) {
		this.certificateValidityDate = certificateValidityDate;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public Date getYearOfEstablishment() {
		return yearOfEstablishment;
	}

	public void setYearOfEstablishment(Date yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	


	public VendorType getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(VendorType vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	
	
}
