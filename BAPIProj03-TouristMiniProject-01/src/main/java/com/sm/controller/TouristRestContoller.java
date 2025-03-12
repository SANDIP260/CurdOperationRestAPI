package com.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.model.Tourist;
import com.sm.service.ITouristMgmtService;

@RestController
@RequestMapping("/api")
public class TouristRestContoller {

	@Autowired
	private ITouristMgmtService touristService;
	
	@PostMapping("/register")
	public ResponseEntity<String> saveTourist(@RequestBody Tourist tourist)
	{
		String msg = touristService.registerTourist(tourist);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	
	
}
