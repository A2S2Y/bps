package com.product.bps.util;

import org.springframework.stereotype.Component;

import com.product.bps.dto.CustomerDto;
import com.product.bps.entity.Customer;

@Component
public class CustomerUtility {
	
	public CustomerDto getDetails(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		
		customerDto.setCustomerId(String.valueOf(customer.getCustomerId()));
		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setContactNumber(customer.getContactNumber());
		customerDto.setMailId(customer.getMailId());
		customerDto.setState(customer.getState());
		customerDto.setCountry(customer.getCountry());
		customerDto.setAddress(customer.getAddress());
		
		customerDto.setVendorTypeId(String.valueOf(customer.getVendorType().getVendorTypeId()));
		customerDto.setCardNumber(customer.getCardNumber());
		customerDto.setBalance(customer.getBalance());
		customerDto.setPaid(customer.getPaid());
		
		return customerDto;
		
	}

}
