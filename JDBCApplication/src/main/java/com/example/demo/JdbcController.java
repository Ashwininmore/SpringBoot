package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
	
	@Autowired
	JdbcTemplate jtemp;
	@RequestMapping("/insert")
	public String appdata() {
		jtemp.update("insert into user values('swami','Nutan')");
		return "<h1>Record Inserted...</h1>";
	}
	@RequestMapping("/delete")
	public String delete() {
		jtemp.update("delete from user where Name='swami'");
		return "<h1>Record Deleted...</h1>";
	}
	
	
}
