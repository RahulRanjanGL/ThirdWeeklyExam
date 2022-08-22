package com.customer.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestfulCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulCustomerAppApplication.class, args);
		System.out.println("Server Started...");
	}

}
