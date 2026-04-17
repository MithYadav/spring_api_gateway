package com.example.test;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

	@GetMapping("/hello")
	public Map<String, String> sayHello() {
		return Map.of("message", "Hello from Spring Boot 3 & Java 21!", "status", "success");
	}

	@PostMapping("/echo")
	public Map<String, Object> echoData(@RequestBody Map<String, Object> input) {
		return Map.of("received", input, "processedBy", "AWS Lambda");
	}

}
