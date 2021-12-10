package com.springframework.msscbrewery.services.V2;

import java.util.UUID;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.V2.BeerDtoV2;

public interface BeerServiceV2 {

	BeerDtoV2 getBeerById(UUID string);

	BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

	void updateBeer(UUID beerid, BeerDtoV2 beerDto);

	void deleteById(UUID beerid);

}
