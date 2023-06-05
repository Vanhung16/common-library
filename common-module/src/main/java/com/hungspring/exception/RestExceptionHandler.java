package com.hungspring.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        var endpointPath = request.getRequestURI();
        return new ErrorResponse(CommonError.RESOURCE_NOT_FOUND.getCode(), ex.getMessage(), endpointPath);
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleUserNotFoundException(UserNotFoundException ex, HttpServletRequest request) {
        var endpointPath = request.getRequestURI();
        return new ErrorResponse(CommonError.USER_NOT_FOUND.getCode(), ex.getMessage(), endpointPath);
    }
}
