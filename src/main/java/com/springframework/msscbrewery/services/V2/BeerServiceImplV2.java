package com.springframework.msscbrewery.services.V2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.V2.BeerDtoV2;
import com.springframework.msscbrewery.web.model.V2.BeerStyle;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {

	@Override
	public BeerDtoV2 getBeerById(UUID beerid) {
		// TODO Auto-generated method stub
		return BeerDtoV2.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle(BeerStyle.GOSE).build();
	}

	@Override
	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
	
		return BeerDtoV2.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle(BeerStyle.GOSE).build();
	}

	@Override
	public void updateBeer(UUID beerid, BeerDtoV2 beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID beerid) {
		log.debug("------------------Inside delete method---------------");
	}

}
