package com.product.bps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.product.bps"})
public class BpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpsApplication.class, args);
	}
}
