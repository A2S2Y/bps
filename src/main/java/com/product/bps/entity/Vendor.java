package com.product.bps.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendor_id;
	private String company_name;
	private int company_registration_number;
	private String website;
	private Date certificate_issue_date;
	private Date certificate_validity_date;
	private int employee_count;
	private int customer_count;
	private int years_of_service;
	private Date year_of_establishment;
	private String contact_number;
	private String mail_id;
	private String state;
	private String country;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="vendor_type_id", unique=true)
	private VendorType vendor_type;
	
	private String card_number;
	private float balance;
	
	@ManyToOne
	@JoinColumn(name="administrator_id", unique=true)
	private Administrator administrator;
	
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getCompany_registration_number() {
		return company_registration_number;
	}
	public void setCompany_registration_number(int company_registration_number) {
		this.company_registration_number = company_registration_number;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getCertificate_issue_date() {
		return certificate_issue_date;
	}
	public void setCertificate_issue_date(Date certificate_issue_date) {
		this.certificate_issue_date = certificate_issue_date;
	}
	public Date getCertificate_validity_date() {
		return certificate_validity_date;
	}
	public void setCertificate_validity_date(Date certificate_validity_date) {
		this.certificate_validity_date = certificate_validity_date;
	}
	public int getEmployee_count() {
		return employee_count;
	}
	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}
	public int getCustomer_count() {
		return customer_count;
	}
	public void setCustomer_count(int customer_count) {
		this.customer_count = customer_count;
	}
	public int getYears_of_service() {
		return years_of_service;
	}
	public void setYears_of_service(int years_of_service) {
		this.years_of_service = years_of_service;
	}
	public Date getYear_of_establishment() {
		return year_of_establishment;
	}
	public void setYear_of_establishment(Date year_of_establishment) {
		this.year_of_establishment = year_of_establishment;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
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
	

	public VendorType getVendor_type() {
		return vendor_type;
	}
	public void setVendor_type(VendorType vendor_type) {
		this.vendor_type = vendor_type;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
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
