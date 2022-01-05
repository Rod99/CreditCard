package com.ibm.academia.creditcard.exceptions;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

    private static final long serialVersionUID = -3770813265856227873L;
}