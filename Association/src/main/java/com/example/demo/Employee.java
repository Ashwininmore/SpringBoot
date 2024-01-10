package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String nm;
	float sal;
	//dependent obj
	@Autowired
	Address addr;
	
	public Employee() {
		System.out.println("Employee created...");
	}

	public Employee(int id, String nm, float sal, Address addr) {
		super();
		this.id = id;
		this.nm = nm;
		this.sal = sal;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", sal=" + sal + ", addr=" + addr + "]";
	}
	
	
}
