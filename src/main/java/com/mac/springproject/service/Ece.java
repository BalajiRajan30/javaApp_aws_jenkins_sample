package com.mac.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ece {

@Autowired
private Student student;

private void Ecedetails() {
	System.out.println("Ece details");
	String a = student.details();
	System.out.println(a);
}


public static void main(String[] args) {
	
	Ece ab = new Ece();
	ab.Ecedetails();
}
	

}
