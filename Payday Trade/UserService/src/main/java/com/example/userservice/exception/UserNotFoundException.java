package com.example.userservice.exception;

public class UserNotFoundException extends Exception{

    public static UserNotFoundException of(String message){
        return new UserNotFoundException(message);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
