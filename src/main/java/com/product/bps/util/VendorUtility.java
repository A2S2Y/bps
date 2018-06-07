package com.product.bps.util;

import org.springframework.stereotype.Component;
import com.product.bps.dto.VendorDto;
import com.product.bps.entity.Vendor;

@Component
public class VendorUtility 
{
	public VendorDto getDetails(Vendor vendor) {
		VendorDto vendorDto = new VendorDto();
		vendorDto.setAddress(vendor.getAddress());
		//vendorDto.setAdministratorId(administratorId);
		vendorDto.setBalance(vendor.getBalance());
		vendorDto.setCardNumber(vendor.getCardNumber());
		vendorDto.setCertificateIssueDate(vendor.getCertificateIssueDate());
		vendorDto.setCertificateValidityDate(vendor.getCertificateValidityDate());
		vendorDto.setCompanyName(vendor.getCompanyName());
		vendorDto.setCompanyRegistrationNumber(vendor.getCompanyRegistrationNumber());
		vendorDto.setContactNumber(vendor.getContactNumber());
		vendorDto.setCountry(vendor.getCountry());
		vendorDto.setCustomerCount(vendor.getCustomerCount());
		vendorDto.setEmployeeCount(vendor.getEmployeeCount());
		vendorDto.setMailId(vendor.getMailId());
		vendorDto.setState(vendor.getState());
		vendorDto.setWebsite(vendor.getWebsite());
		vendorDto.setVendorId(String.valueOf(vendor.getVendorId()));
		vendorDto.setYearOfEstablishment(vendor.getYearOfEstablishment());
		vendorDto.setYearsOfService(vendor.getYearsOfService());
		vendorDto.setVendorTypeId(String.valueOf(vendor.getVendorTypeId().getVendorTypeId()));
		
		
		return vendorDto;
		
	}

}
