package com.mac.springproject;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@EnableAspectJAutoProxy
public class ParentSpringprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentSpringprojectApplication.class, args);
	
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//	
//		ConsumerService consumer = context.getBean(ConsumerService.class);
//		
//		consumer.savingConsumer();
//		consumer.deleteConsumer();
	}

}
