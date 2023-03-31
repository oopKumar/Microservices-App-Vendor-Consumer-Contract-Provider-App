package com.oop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contract")
public class ControllerRest {
	
	@GetMapping("/data")
	public String getData() {
		return "From Contract";
	}

}
