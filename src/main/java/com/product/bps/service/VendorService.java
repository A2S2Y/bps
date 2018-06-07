package com.product.bps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.bps.dto.CustomerDto;
import com.product.bps.dto.VendorDto;
import com.product.bps.entity.Customer;
import com.product.bps.entity.Vendor;
import com.product.bps.entity.VendorType;
import com.product.bps.repository.VendorRepository;
import com.product.bps.repository.VendorTypeRepository;
import com.product.bps.util.VendorUtility;

@Service
public class VendorService 
{
	@Autowired
	VendorTypeRepository vendorTypeRepository;
	
	@Autowired
	VendorRepository vendorRepository;
	
	@Autowired
	VendorUtility vendorUtility;
	public void saveVendor(VendorDto vendorDto) {

		Vendor vendor;
		if (vendorDto.getVendorId() != null){
			vendor = vendorRepository.findByVendorId(Long.parseLong(vendorDto.getVendorId()));
		} else {
			vendor = new Vendor();
		}
		vendor.setAddress(vendorDto.getAddress());
		//vendor.setAdministrator(administrator);
		vendor.setBalance(vendorDto.getBalance());
		vendor.setCardNumber(vendorDto.getCardNumber());
		vendor.setCertificateIssueDate(vendorDto.getCertificateIssueDate());
		vendor.setCertificateValidityDate(vendorDto.getCertificateValidityDate());
		vendor.setCompanyName(vendorDto.getCompanyName());
		vendor.setCompanyRegistrationNumber(vendorDto.getCompanyRegistrationNumber());
		vendor.setContactNumber(vendorDto.getContactNumber());
		vendor.setCountry(vendorDto.getCountry());
		vendor.setCustomerCount(vendorDto.getCustomerCount());
		vendor.setEmployeeCount(vendorDto.getEmployeeCount());
		vendor.setMailId(vendorDto.getMailId());
		vendor.setState(vendorDto.getState());
		
		VendorType vendorTypeId = vendorTypeRepository
				.findByVendorTypeId(Long.parseLong(vendorDto.getVendorTypeId()));
		vendor.setVendorTypeId(vendorTypeId);
		
		vendor.setWebsite(vendorDto.getWebsite());
		vendor.setYearOfEstablishment(vendorDto.getYearOfEstablishment());
		vendor.setYearsOfService(vendorDto.getYearsOfService());
		vendorRepository.save(vendor);
	
	}
	
	public VendorDto getVendor(String id) {
		
		Vendor vendor = new Vendor();
		vendor = vendorRepository.findByVendorId(Long.parseLong(id));
		VendorDto vendorDto = vendorUtility.getDetails(vendor);
		return vendorDto;
	}

	public void deleteVendor(String id) {

		Vendor vendor = vendorRepository.findByVendorId(Long.parseLong(id));
		vendorRepository.delete(vendor);

	}


}
