package com.fos.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException(String message) {
        super("The order is not available");
    }
	
	

}
