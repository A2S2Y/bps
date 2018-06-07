package com.product.bps.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.product.bps.dto.CustomerDto;
import com.product.bps.dto.VendorDto;
import com.product.bps.repository.CustomerRepository;
import com.product.bps.service.CustomerService;
import com.product.bps.service.VendorService;

@RestController
public class VendorController 
{
	@Autowired
	VendorService vendorService;

	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping(value = "/saveVendor", method = RequestMethod.POST)
	public ResponseEntity<?> saveVendor(@RequestBody String vendor) throws IOException {

		VendorDto vendorDto = new VendorDto();
		Gson gson = new Gson();
	   //Gson gson1=  new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
	   /*  Date test = gson.fromJson(date, Date.class);
	    System.out.println("date:" + test);
*/
		vendorDto = gson.fromJson(vendor, VendorDto.class);
		try {

			vendorService.saveVendor(vendorDto);
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);

		}

	}

	@RequestMapping(value = "/getVendorDetails/{id}", method = RequestMethod.GET)
	public VendorDto getVendorDetails(@PathVariable(value = "id") String id)
			throws IOException {
		//VendorDto vendorDto = new VendorDto();
		return  vendorService.getVendor(id);
		// return response.setStatus(200, "Successfull");
		

	}
	
	@RequestMapping(value = "/deleteVendor/{id}", method = RequestMethod.DELETE)
	public void deleteVendor(@PathVariable(value = "id") String id)
			throws IOException {

		vendorService.deleteVendor(id);
		// return response.setStatus(200, "Successfull");
		

	}
	

}
