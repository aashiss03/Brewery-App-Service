package com.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustById(UUID custid) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Ashis Mohan Mohapatra").build();
		
	}

	;
}
