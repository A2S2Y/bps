package com.product.bps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.bps.dto.AdministratorDTO;
import com.product.bps.entity.Administrator;
import com.product.bps.repository.AdministratorRepository;

@Service
public class AdministratorService {
	
	@Autowired
	AdministratorRepository administratorRepository;

	public List<Administrator> validateUser(AdministratorDTO administratorDTO) {
		
		List<Administrator> administrator = administratorRepository.findByAdminNameAndPassword(administratorDTO.getAdminName(),administratorDTO.getPassword());
	
		return administrator;
		
	}

}
