package com.product.bps;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.product.bps"})
public class BpsApplication {

/*	@Bean
	public SessionFactory setSessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}
*/	
	public static void main(String[] args) {
		SpringApplication.run(BpsApplication.class, args);
	}
}
