package com.product.bps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.bps.entity.VendorType;
import com.product.bps.service.VendorTypeService;

@RestController
public class VendorTypeController {

	@Autowired
	VendorTypeService vendorTypeService;

	@RequestMapping(value = "/vendorTypes", method = RequestMethod.GET)
	public List<VendorType> getAllVendorTypes() {
		return vendorTypeService.getVendorTypes();

	}

}
