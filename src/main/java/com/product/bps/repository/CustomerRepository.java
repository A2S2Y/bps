package com.product.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.bps.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	public Customer findByCustomerId(Long id);
	public Customer findByCustomerId(long id);
}
