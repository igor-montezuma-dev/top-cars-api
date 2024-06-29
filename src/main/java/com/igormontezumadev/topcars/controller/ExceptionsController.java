package com.igormontezumadev.topcars.controller;

import com.igormontezumadev.topcars.entity.ErrorResponse;
import com.igormontezumadev.topcars.handlers.BrandNotFoundException;
import com.igormontezumadev.topcars.handlers.InvalidModelException;
import com.igormontezumadev.topcars.handlers.ModelNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(BrandNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleBrandNotFoundException(BrandNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleModelNotFoundException(ModelNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidModelException.class)
    public ResponseEntity<ErrorResponse> handleInvalidModelException(InvalidModelException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
