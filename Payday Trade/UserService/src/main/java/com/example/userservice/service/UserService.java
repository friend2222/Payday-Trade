package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.exception.UserNotFoundException;


import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<UserDto> getUserByName(String name) throws UserNotFoundException;
    Optional<UserDto> updateBalance(UserDto userDto) throws UserNotFoundException;
     List<UserDto>  getAllUsers();
    UserDto saveUser(UserDto userDto);


}
