package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	int pin;
	String city, state;
	public Address() {
		System.out.println("Address created...");
	}
	public Address(int pin, String city, String state) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
