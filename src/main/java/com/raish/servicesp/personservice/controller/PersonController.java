package com.raish.servicesp.personservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

	@GetMapping("/name/{id}")
	public String getName(@PathVariable("id") String id) {
		
		if(id.equals("USER_1")) {
			return "sahil";
		}
		throw new RuntimeException();
	}
}
