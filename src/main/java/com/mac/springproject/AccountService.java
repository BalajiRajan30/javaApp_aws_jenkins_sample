package com.mac.springproject;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

	public void savingAccount() {

		System.out.println("Account is Saved");
	}

	public void deleteAccount() {

		System.out.println("Account is Deleted");

	}

}
