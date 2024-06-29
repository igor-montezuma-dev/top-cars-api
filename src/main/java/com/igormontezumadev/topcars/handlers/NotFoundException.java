package com.igormontezumadev.topcars.handlers;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message, HttpStatus status){
        super(message);
    }
}
