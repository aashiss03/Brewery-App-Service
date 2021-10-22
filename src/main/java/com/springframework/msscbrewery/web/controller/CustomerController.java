package com.springframework.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.msscbrewery.services.BeerService;
import com.springframework.msscbrewery.services.CustomerService;
import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

@Autowired
private CustomerService customerService;

@GetMapping("/{custid}")
public ResponseEntity<CustomerDto> getCustomer(@PathVariable("custid") UUID custid){
	return new ResponseEntity<CustomerDto>(customerService.getCustById(custid), HttpStatus.OK);
	
}

}
