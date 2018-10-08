package com.myliburry.pojos;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// RestController is @Controller and @ResponseBody combined.
@RestController
public class HelloWorldController {

	private static final String template = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

//	@RequestMapping Maps the HTTP requests that hit the /HelloWorld end point to the greeting method
	@RequestMapping("/HelloWorld")
	
		// @RequestParam Maps the value of the query string 
		// parameter 'name' to the 'name' param in greeting()
		// defaultValue of 'name' = "World".
	public HelloWorld greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new HelloWorld(counter.incrementAndGet(), String.format(template, name));
	}
}
