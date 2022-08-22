package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomerAppApplication.class, args);
		System.out.println("Server Started...");
	}

}
