package com.product.bps.dto;

public class CustomerDto {

	private String customerId;
	private String customerName;
	private String contactNumber;
	private String mailId;
	private String state;
	private String country;
	private String address;
	private String vendorTypeId;
	private String cardNumber;
	private Float balance;
	private Boolean paid;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(String vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

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

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", mailId=" + mailId + ", state=" + state + ", country=" + country + ", address="
				+ address + ", vendorTypeId=" + vendorTypeId + ", cardNumber=" + cardNumber + ", balance=" + balance
				+ ", paid=" + paid + "]";
	}

}
