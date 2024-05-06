package com.test.execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SSNExecptionHandle {

	@ExceptionHandler(value = CitizenDetailsNotFound.class)
	public ResponseEntity<?> handleDetails(Exception exception){
		
		ApiInfo ai = new ApiInfo();
		ai.setMessage(exception.getMessage());
		return new ResponseEntity<>(ai, HttpStatus.BAD_REQUEST);
	}
}