package com.express.accounts.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.express.accounts.service.KafkaService;

@RestController
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		
		this.kafkaService.updateLocation("( "+Math.round(Math.random()*100)+ " , " +Math.round(Math.random()*100) + ")");
		return new ResponseEntity<>(Map.of("message","location Updated"),HttpStatus.OK);
	}
}
