package com.mac.springproject;

import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

	public void savingConsumer() {

		System.out.println("Consumer is Saved");
	}

	public void deleteConsumer() {

		System.out.println("Consumer is Deleted");

	}

}
