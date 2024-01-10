package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/listcity")
	public List display() {
		List<String> list=new ArrayList<String>();
		list.add("Pune");
		list.add("Jalgaon");
		list.add("Goa");
		list.add("Mumbai");
		return list;
	}
}
