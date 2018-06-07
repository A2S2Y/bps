package com.product.bps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.product.bps.dto.AdministratorDTO;
import com.product.bps.entity.Administrator;
import com.product.bps.service.AdministratorService;

@RestController
public class AdministratorController {

	@Autowired
	AdministratorService administratorService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody String login) {

		AdministratorDTO administratorDTO = new AdministratorDTO();
		Gson gson = new Gson();

		administratorDTO = gson.fromJson(login, AdministratorDTO.class);

		List<Administrator> administrator = administratorService.validateUser(administratorDTO);

		if (administrator.size() > 0) {
			
			return new ResponseEntity<String>("Success",HttpStatus.OK);

		}else {
			return new ResponseEntity<String>("Failure",HttpStatus.BAD_REQUEST);
		}

	}
}
