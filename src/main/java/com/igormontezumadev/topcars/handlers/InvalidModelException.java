package com.igormontezumadev.topcars.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidModelException extends RuntimeException {
    public InvalidModelException(String message) {
        super(message);
    }
}