package com.igormontezumadev.topcars.validators;

import org.springframework.http.HttpStatus;

public class BadRequestException extends Throwable {
    public BadRequestException(String s, HttpStatus status) {
    }
}
