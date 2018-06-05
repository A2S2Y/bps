package com.product.bps.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<String> customerSave(@RequestBody String customerJson, HttpServletResponse response)
			throws IOException {

		CustomerDto customerDto = new CustomerDto();
		Gson gson = new Gson();

		customerDto = gson.fromJson(customerJson, CustomerDto.class);
		System.out.println("Creating User " + customerJson.toString());
		try {

			customerService.saveCustomer(customerDto);
			// return response.setStatus(200, "Successfull");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			// response.sendError(500, "Failure");
			return new ResponseEntity(HttpStatus.BAD_REQUEST);

		}

	}

	@RequestMapping(value = "/customerGetDetails/{id}", method = RequestMethod.GET)
	public CustomerDto customerGet(@PathVariable(value = "id") String id, HttpServletResponse response)
			throws IOException {

		CustomerDto customerDto = new CustomerDto();
		// Gson gson = new Gson();
		//
		// customerDto = gson.fromJson(customerJson, CustomerDto.class);

		return  customerService.getCustomer(id);
		// return response.setStatus(200, "Successfull");
		

	}
	
	@RequestMapping(value = "/customerDelete/{id}", method = RequestMethod.DELETE)
	public void customerDelete(@PathVariable(value = "id") String id, HttpServletResponse response)
			throws IOException {

		 customerService.deleteCustomer(id);
		// return response.setStatus(200, "Successfull");
		

	}
	
	
	

}
