package com.igormontezumadev.topcars.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BrandNotFoundException extends RuntimeException {
    public BrandNotFoundException(String message) {
        super(message);
    }
}
