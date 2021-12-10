package com.springframework.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("custid") UUID custid) {
		return new ResponseEntity<CustomerDto>(customerService.getCustById(custid), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity handleSave(@RequestBody CustomerDto customerDto) {
		CustomerDto savedCustimer = customerService.saveNewBeer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("LOCATION", "api/v1/customer/" + savedCustimer.getId().toString());
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@PutMapping("/{customerid}")
	public ResponseEntity handleUpdate(@PathVariable("customerid") UUID customerid,
			@RequestBody CustomerDto customerDto) {
		customerService.updateBeer(customerid, customerDto);

		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{customerid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("customerid") UUID customerid) {

		customerService.deleteById(customerid);

	}

}
