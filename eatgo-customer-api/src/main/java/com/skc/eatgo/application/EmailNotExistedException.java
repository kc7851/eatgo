package com.skc.eatgo.application;

public class EmailNotExistedException extends RuntimeException {

    EmailNotExistedException(String email) {
        super("Eamil is not registered: " + email);
    }

}
