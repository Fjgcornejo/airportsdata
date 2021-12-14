package com.minsait.onesait.microservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.minsait.onesait.microservice.model.AirportsdataWrapper;
import com.minsait.onesait.microservice.repository.AirportsdataRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("airportsdata")
@Api(value = "Restaurants REST service", tags = { "airportsdata" })
@ApiResponses({ @ApiResponse(code = 429, message = "Too Many Requests"),
		@ApiResponse(code = 500, message = "Error processing request"),
		@ApiResponse(code = 403, message = "Forbidden") })
@Slf4j
public class AirportsdataService {

	@Autowired
	private AirportsdataRepository ontologyRepository;

	@GetMapping
	@ApiOperation(response = AirportsdataWrapper[].class, httpMethod = "GET", value = "Return all airportsdata")
	@ApiResponse(code = 429, message = "Too Many Requests")
	public ResponseEntity<List<AirportsdataWrapper>> getAllairportsdatas() {
		log.info("Getting all registered airportsdatas");
		final List<AirportsdataWrapper> ontologies = ontologyRepository.findAll();

		return new ResponseEntity<>(ontologies, HttpStatus.OK);
	}
}
