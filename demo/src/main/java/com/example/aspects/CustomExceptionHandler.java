package com.example.aspects;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.bean.ResponseMsg;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseMsg handleNotFoundException(RuntimeException ex) {
		ResponseMsg responseMsg = new ResponseMsg(ex.getMessage());
		return responseMsg;
	}
}
