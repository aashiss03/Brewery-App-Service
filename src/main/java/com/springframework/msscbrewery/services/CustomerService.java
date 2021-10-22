package com.springframework.msscbrewery.services;

import java.util.UUID;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustById(UUID custid);

}
