package com.product.bps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministratorController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login() {
		
	}
}
