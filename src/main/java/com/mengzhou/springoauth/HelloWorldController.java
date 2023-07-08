package com.mengzhou.springoauth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
	public String helloWorld() {	 
		return "Hello World";
	}

    @GetMapping("/secured")
	public String goToSecure() {
		 
		return "Hello Secured!";
	}

}




 