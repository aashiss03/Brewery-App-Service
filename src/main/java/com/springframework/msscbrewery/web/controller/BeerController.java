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
import com.springframework.msscbrewery.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

@Autowired
private BeerService beerService;

@GetMapping("/{beerid}")
public ResponseEntity<BeerDto> getBeer(@PathVariable("beerid") UUID beerid){
	return new ResponseEntity<BeerDto>(beerService.getBeerById(beerid), HttpStatus.OK);
	
}

}
