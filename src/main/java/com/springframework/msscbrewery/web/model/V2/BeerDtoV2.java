package com.springframework.msscbrewery.web.model.V2;

import java.util.UUID;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeerDtoV2 {
	
	private UUID id;
	private String beerName;
	private BeerStyle beerStyle;
	private Long upc;

}
