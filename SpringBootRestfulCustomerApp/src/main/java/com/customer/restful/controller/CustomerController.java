package com.customer.restful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.restful.dao.CustomerRepo;
import com.customer.restful.model.Customer;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo repo;
	
	//Select all Customer Details
	@GetMapping(path="/customer")
	 public List<Customer> getCustomer(){

		return repo.findAll();

	 }
	
	//Select a particular customer based on customer-Id
	@GetMapping("/customer/{custId}")
	 public Optional<Customer> getAlien(@PathVariable("custId")int custId) {

		return repo.findById(custId);

	 }
	
	//Insert a Customer record in the table
	 @PostMapping(path="/customer",consumes= {"application/json"})
	 public Customer addCustomer(@RequestBody Customer cust){

		 repo.save(cust);
		 
		 return cust;
	 }
	 
	 //Update the customer detail in the table
	 @PutMapping(path="/customer",consumes= {"application/json"})
	 public Customer saveOrUpdateCustomer(@RequestBody Customer cust){

		 repo.save(cust);
	
		 return cust;

	 }
	 
	 //Delete a customer based on customer-Id
	 @DeleteMapping("/customer/{custId}")
	 public String deleteCustomer(@PathVariable int custId){
	
		 Customer cus = repo.getOne(custId);
		 repo.delete(cus);

		 return " Customer deleted Successfully!!";

	 }
	
}
