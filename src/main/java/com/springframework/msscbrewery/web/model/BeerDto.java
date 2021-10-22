package com.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto {
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;

}
