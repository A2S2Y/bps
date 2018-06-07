package com.product.bps.controller;

import java.io.IOException;
import java.util.List;

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
import com.product.bps.entity.Customer;
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
		try {
			customerService.saveCustomer(customerDto);
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/customerGetDetails/{id}", method = RequestMethod.GET)
	public Object customerGet(@PathVariable(value = "id") String id) throws Exception {

		return customerService.getCustomer(id);

	}

	@RequestMapping(value = "/customerDelete/{id}", method = RequestMethod.DELETE)
	public void customerDelete(@PathVariable(value = "id") String id) {

		customerService.deleteCustomer(id);

	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getAllCustomers() {
		return customerService.getCustomers();
		
	}

}
