package com.product.bps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.bps.entity.Administrator;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator,Long> {

	public List<Administrator> findByAdminNameAndPassword(String adminName, String password);

}
