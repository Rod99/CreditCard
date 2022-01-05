package com.ibm.academia.creditcard.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 8076042473859475160L;
}
