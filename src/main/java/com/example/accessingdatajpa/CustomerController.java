package com.example.accessingdatajpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customers")
@Controller
public class CustomerController {
	
	@Resource
	private CustomerRepository customerRepo;

	@GetMapping("")
	public String findAllCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customers";
	}
	
	
}
