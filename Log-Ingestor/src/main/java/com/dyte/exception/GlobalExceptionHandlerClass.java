package com.dyte.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

	
//	Exception Handler for Exception class
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> exceptionClassHandler(Exception pe, WebRequest req){
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), pe.getMessage(), req.getDescription(false));
		
		
				
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

	
//	Exception Handler for No URI found or wrong uri
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noUriHandlerFoundException(NoHandlerFoundException nfe,WebRequest req){
		
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(),nfe.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.OK);
	}
	



//	Exception handler for FeedBack  Exception
	@ExceptionHandler(LogException.class)
	public ResponseEntity<ErrorDetails> feedBackException(LogException re, WebRequest req){

		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), re.getMessage(), req.getDescription(false));

		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}



}
