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
import com.springframework.msscbrewery.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	@Autowired
	private BeerService beerService;

	@GetMapping("/{beerid}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerid") UUID beerid) {
		return new ResponseEntity<BeerDto>(beerService.getBeerById(beerid), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity handleSave(@RequestBody BeerDto beerDto) {
		BeerDto savedBeer = beerService.saveNewBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("LOCATION", "/api/v1/beer/"+savedBeer.getId().toString());
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerid}")
	public ResponseEntity handleUpdate(@PathVariable("beerid") UUID beerid,@RequestBody BeerDto beerDto) {
		beerService.updateBeer(beerid,beerDto);
		
		return new ResponseEntity( HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{beerid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerid") UUID beerid) {
	
		
		beerService.deleteById(beerid);
		
		
	}

}
