package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;

@RestController
@RequestMapping("customers")
public class CustomerController {

	
	
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> findAllCustomers() {
		System.out.println("Hello");
		List<Customer> listOfCustomers = new ArrayList<Customer>();
		Customer c1 = new Customer(1, "Steven", 23);
		Customer c2 = new Customer(2, "John", 25);
		Customer c3 = new Customer(3, "Neena", 29);
		
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		listOfCustomers.add(c3);
		return listOfCustomers;
	}
}
