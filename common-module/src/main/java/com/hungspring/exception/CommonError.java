package com.hungspring.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonError {
    RESOURCE_NOT_FOUND("404", "Resource not found"),
    USER_NOT_FOUND("404", "User not found");
    private String code;
    private String message;
}
