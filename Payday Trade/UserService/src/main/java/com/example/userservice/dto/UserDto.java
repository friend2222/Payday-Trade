package com.example.userservice.dto;


import com.example.userservice.annotation.UserNameValidation;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class UserDto {

    @UserNameValidation
    private String name;

    @NotBlank
    private String password;

    private BigDecimal balance;


    public UserDto() {
    }

    public UserDto(String name, String password, BigDecimal balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public UserDto setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }


}
