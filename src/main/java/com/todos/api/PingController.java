package com.todos.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	@RequestMapping("/ping")
	public String pingMe() {
		return "Hello this Spring boot";
	}
	
}
