package com.mac.springproject.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mac.springproject.service.Temp;

@RestController
public class DetailsController {
	
	@RequestMapping(path = "/details/{name}" , method = RequestMethod.GET)
	private String getDetails(@PathVariable String name  ) {
		
		String receivedValue = name;
		
		return receivedValue;
	}
	
	
	@RequestMapping(path = "/details" , method = RequestMethod.GET)
	private String getParamDetails(@RequestParam String name  ) {
		
		String receivedValue = name;
		
		return receivedValue;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	private String getSamplemethod() {
		
		return "My Java Application";
	}
	
	

}
