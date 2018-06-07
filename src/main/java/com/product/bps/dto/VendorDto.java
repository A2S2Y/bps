package com.product.bps.dto;

import java.util.Date;

public class VendorDto 
{

	private String vendorId;
	private String companyName;
	private int companyRegistrationNumber;
	private String website;
	private Date certificateIssueDate;
	private Date certificateValidityDate;
	private int employeeCount;
	private int customerCount;
	private int yearsOfService;
	private Date yearOfEstablishment;
	private String contactNumber;
	private String mailId;
	private String state;
	private String country;
	private String address;
	
	private String cardNumber;
	private Float balance;
	private String vendorTypeId;
	private String administratorId;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public String getVendorTypeId() {
		return vendorTypeId;
	}
	public void setVendorTypeId(String vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}
	public String getAdministratorId() {
		return administratorId;
	}
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
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

 
}
