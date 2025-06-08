package com.fullstackprojects.fullstack.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(Long id) {
        	super("Could not found the user with id"+id);
        }
}
