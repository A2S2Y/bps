package com.product.bps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.bps.dto.CustomerDto;
import com.product.bps.entity.Customer;
import com.product.bps.entity.VendorType;
import com.product.bps.repository.CustomerRepository;
import com.product.bps.repository.VendorTypeRepository;
import com.product.bps.util.CustomerUtility;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	VendorTypeRepository vendorTypeRepository;

	@Autowired
	CustomerUtility customerUtility;

	public void saveCustomer(CustomerDto customerJson) {

		Customer customer = null;

		if (customerJson.getCustomerId() != null){
			customer = customerRepository.findByCustomerId(Long.parseLong(customerJson.getCustomerId()));
		} else {
			customer = new Customer();
		}

		customer.setCustomerName(customerJson.getCustomerName());
		customer.setContactNumber(customerJson.getContactNumber());
		customer.setMailId(customerJson.getMailId());
		customer.setState(customerJson.getState());
		customer.setCountry(customerJson.getCountry());
		customer.setAddress(customerJson.getAddress());

		VendorType vendorTypeId = vendorTypeRepository
				.findByVendorTypeId(Long.parseLong(customerJson.getVendorTypeId()));
		customer.setVendorType(vendorTypeId);
		customer.setCardNumber(customerJson.getCardNumber());
		customer.setBalance(customerJson.getBalance());
		// customer.setAdministrator(customerJson.getAdministratorId());
		customer.setPaid(customerJson.getPaid());
		customerRepository.save(customer);
	}

	public CustomerDto getCustomer(String id) {

		Customer customer = new Customer();

		customer = customerRepository.findByCustomerId(Long.parseLong(id));

		CustomerDto customerDto = customerUtility.getDetails(customer);

		return customerDto;
	}

	public void deleteCustomer(String id) {

		Customer customer = customerRepository.findByCustomerId(Long.parseLong(id));
		customerRepository.delete(customer);

	}

}
