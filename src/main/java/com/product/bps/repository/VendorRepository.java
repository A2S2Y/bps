package com.product.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.bps.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Long> {

}
