package org.kakarro.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

	private Chef chef;
	public  void cook() {
		System.out.println("요리를 한다....................");
		chef.cook();
	}
	
	
}
