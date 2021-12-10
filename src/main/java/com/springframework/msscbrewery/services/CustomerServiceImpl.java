package com.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustById(UUID custid) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Ashis Mohan Mohapatra").build();
		
	}

	@Override
	public CustomerDto saveNewBeer(CustomerDto customerDto) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Ashis Mohan Mohapatra").build();
		
	}

	@Override
	public void updateBeer(UUID customerid, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID customerid) {
		log.debug("------------------Inside delete method---------------");
		
	}

	
}
