package com.sample.sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample.Entity.Test;
import com.sample.sample.Service.TestService;

@RestController
@RequestMapping("/api/sample/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@GetMapping
	public List<Test> getAllTests(){
		return (List<Test>) testService.getAllTests();
	}

}
