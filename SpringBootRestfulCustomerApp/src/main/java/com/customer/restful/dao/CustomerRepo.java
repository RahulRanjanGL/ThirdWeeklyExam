package com.customer.restful.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.customer.restful.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	

}
