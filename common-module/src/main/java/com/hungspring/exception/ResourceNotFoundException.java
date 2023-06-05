package com.hungspring.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public ResourceNotFoundException() {
        super(CommonError.RESOURCE_NOT_FOUND.getMessage());
    }
}
