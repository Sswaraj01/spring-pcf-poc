package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.StudentDtls;
import com.example.modal.StudentData;
import com.example.repository.StudentRepositroy;



@RestController
@EnableAutoConfiguration
public class HelloWorldController {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	
	@Autowired(required=true)
	private StudentRepositroy studentRepo;
	
	
	
	
	
	@RequestMapping("/hello")
	public String hello( ){
		return "Hello world";
	}
	
	@RequestMapping(value="/student/{roll}",method = RequestMethod.GET)
	public @ResponseBody StudentDtls getStdDtls(@PathVariable("roll") String roll){
		StudentData stddtls= studentRepo.findByRoll(roll);
		StudentDtls stdData=new StudentDtls(stddtls.getName(), stddtls.getRoll(), stddtls.getId(), stddtls.getGender(), stddtls.getAge());
	
		return stdData;
		
	}
	
	@RequestMapping(value="/validate",method = RequestMethod.POST)
	public String validateStudentDtls(@RequestBody StudentDtls stddtls){
		logger.info("This is a valid Student");
		logger.debug("hi this debug in validation");
		logger.warn("hi this warn in validation");
		logger.error("hi this error in validation");
		if(Integer.valueOf(stddtls.getAge())<16){
			throw new RuntimeException("Runtime Exception is catched age must be greater than 16");
		}else{
			StudentData stdEntity=new StudentData(stddtls.getName(), stddtls.getRoll(), stddtls.getAge(), stddtls.getGender());
			studentRepo.save(stdEntity);
		}
		
		return "Valid Student";
		
	}
	
}
