package com.mac.springproject;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfiguration {

	@Before("execution(* *.savingConsumer())")
	private void loggingAspect() {
		System.out.println("I am now Logging");
	}

	@After("execution(* *.*Consumer())")
	private void afterLogging() {

		System.out.println("I am logging After");
	}

	@Pointcut("within(com..*)")
	private void authenticationPointcut() {

	}

	@Pointcut("within(com..*)")
	private void authorizationPointcut() {

	}

//	@Before("authenticationPointcut() && authorizationPointcut()")
//	private void authenticationandauthorization() {
//		System.out.println("I am trying to Authenticate");
//
//	}

}
