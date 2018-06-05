package com.product.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.bps.entity.VendorType;

@Repository
public interface VendorTypeRepository extends JpaRepository<VendorType,Long>{
	public VendorType findByVendorTypeId(int id);
}
