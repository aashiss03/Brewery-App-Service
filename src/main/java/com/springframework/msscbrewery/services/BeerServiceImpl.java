package com.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springframework.msscbrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerid) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
	
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
	}

	@Override
	public void updateBeer(UUID beerid, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID beerid) {
		log.debug("------------------Inside delete method---------------");
	}

}
