package com.skc.eatgo.application;

public class EmailExistedException extends RuntimeException {

    EmailExistedException(String email) {
        super("Eamil is already registered: " + email);
    }

}
