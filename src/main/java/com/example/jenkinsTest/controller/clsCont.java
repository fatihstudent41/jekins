package com.example.jenkinsTest.controller;

import java.io.IOException;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class clsCont {

	@GetMapping("/test")
	public ResponseEntity<?> test()  
	{
		try {

		return new ResponseEntity<String>("Done",HttpStatus.OK);
		}
	 
		catch (Exception e) {
			return new ResponseEntity<String>("Error",HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		
		
	}
	
	@GetMapping("/stringTest")
	public String test1() {
		return "my keyboard buttons are so small";
	}
	
	
}
