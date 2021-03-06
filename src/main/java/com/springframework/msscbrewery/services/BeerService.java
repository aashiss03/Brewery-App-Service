package com.springframework.msscbrewery.services;

import java.util.UUID;

import com.springframework.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID string);

	BeerDto saveNewBeer(BeerDto beerDto);

	void updateBeer(UUID beerid, BeerDto beerDto);

	void deleteById(UUID beerid);

}
