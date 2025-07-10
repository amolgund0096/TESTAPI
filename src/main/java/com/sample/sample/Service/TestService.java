package com.sample.sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.sample.Entity.Test;
import com.sample.sample.Repository.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository testRepository;
	
	public List<Test> getAllTests(){
		return (List<Test>) testRepository.findAll();
	}
	
	public Test getTestById(Long id) {
		return (Test) testRepository.findById(id).orElse(null);
	}

}
