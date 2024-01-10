package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AssociationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(AssociationApplication.class, args);
		
		 Address a1= ctx.getBean(Address.class);
		 a1=new Address(425001, "Jalgaon", "Maharashtra");
		 
		 Employee e1= ctx.getBean(Employee.class);
		 Employee e2= ctx.getBean(Employee.class);
		 
		 e1= new Employee(123,"Ashu",50000.0f,a1);
		 e2= new Employee(456,"swami",60000.0f,a1);
		 System.out.println(e1);
		 System.out.println(e2);
	}

}
