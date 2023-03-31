package com.oop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oop.consumer.ContractConsumer;

@RestController
@RequestMapping("/vendor")
public class VendorRest {
	@Autowired
	ContractConsumer contractConsumer;

	@GetMapping("/info")
	public String getInfo()
	{
		return "From Vendor=>"+contractConsumer.callContractGetData();
	}
}
