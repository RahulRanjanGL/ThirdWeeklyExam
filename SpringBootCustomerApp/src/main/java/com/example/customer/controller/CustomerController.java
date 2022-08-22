package com.example.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/customer")
	public String displayCustomerDetails(@RequestParam String loginId, String password, String custName, String custId, String phoneNo, String address, Model m ) {
		
		m.addAttribute("loginId", loginId);
		m.addAttribute("password", password);
		m.addAttribute("custName", custName);
		m.addAttribute("custId", custId);
		m.addAttribute("phone", phoneNo);
		m.addAttribute("address", address);
		
		return "customerView";
	}
}
