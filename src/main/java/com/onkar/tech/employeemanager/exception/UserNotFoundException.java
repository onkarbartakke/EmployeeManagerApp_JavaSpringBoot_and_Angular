package com.onkar.tech.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
         super(message);
    }
}
