package com.example.userservice.constants;

public enum ErrorCodes {
    INVALID_USERNAME(400 , "User Name is not valid"),
    NOT_STRONG_PASSWORD(400 , "Weak Password"),
    USER_NOT_FOUND( 400 , "Trying to do operation on User that does not exists");
    private int errorCode;
    private String message;


    ErrorCodes(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message =message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

}
