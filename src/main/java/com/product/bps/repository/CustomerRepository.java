package com.product.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.bps.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
