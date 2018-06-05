package com.product.bps.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.product.bps.dto.CustomerDto;
import com.product.bps.repository.CustomerRepository;
import com.product.bps.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping(value = "/customerSave", method = RequestMethod.POST)
	public ResponseEntity<?> customerSave(@RequestBody String customerJson) throws IOException {

		CustomerDto customerDto = new CustomerDto();
		Gson gson = new Gson();

		customerDto = gson.fromJson(customerJson, CustomerDto.class);
		System.out.println("Creating User " + customerJson.toString());
		try {

			customerService.saveCustomer(customerDto);
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);

		}
		

	}

}
