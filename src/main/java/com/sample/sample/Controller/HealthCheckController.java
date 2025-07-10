package com.sample.sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	@GetMapping("/api/this")
	public int getBack() {
		int a=1;
		int b=7;
		int c = a+b;
		return c;
	}

}
