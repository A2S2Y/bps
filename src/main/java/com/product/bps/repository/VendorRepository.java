package com.product.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.bps.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Long> {

}
