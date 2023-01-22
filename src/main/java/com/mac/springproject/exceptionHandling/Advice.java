package com.mac.springproject.exceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class Advice {
	
@ExceptionHandler(NullPointerException.class)
private String handlingNull() {

	return "your input value is empty";

}
	

}
