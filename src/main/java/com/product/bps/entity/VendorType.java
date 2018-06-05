package com.product.bps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor_type")
public class VendorType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vendorTypeId;

	public long getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(long vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getVendorTypeName() {
		return vendorTypeName;
	}

	public void setVendorTypeName(String vendorTypeName) {
		this.vendorTypeName = vendorTypeName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Column(name = "vendor_type_name")
	private String vendorTypeName;

	@Column(name = "amount")
	private Float amount;

	public Long getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(Long vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getVendorTypeName() {
		return vendorTypeName;
	}

	public void setVendorTypeName(String vendorTypeName) {
		this.vendorTypeName = vendorTypeName;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

}
