package com.product.bps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.bps.entity.VendorType;
import com.product.bps.repository.VendorTypeRepository;

@Service
public class VendorTypeService {

	@Autowired
	VendorTypeRepository vendorTypeRepository;
	
	public List<VendorType> getVendorTypes() {
		List<VendorType> vendorTypes= vendorTypeRepository.findAll();
		return vendorTypes;
	}

}
