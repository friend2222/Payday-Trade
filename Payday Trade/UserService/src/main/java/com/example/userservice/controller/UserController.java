package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.exception.UserNotFoundException;
import com.example.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@RestController
@RequestMapping("/v1/user")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/save")
    public ResponseEntity<UserDto> saveUser(@RequestBody
                                            @Valid
                                            @NotNull UserDto user) {

        return ResponseEntity.ok(userService.saveUser(user));
    }


    @GetMapping("/get-user/{username}")
    public ResponseEntity<UserDto> getUser(@PathVariable String username) throws UserNotFoundException {
        Optional<UserDto> user = userService.getUserByName(username);
        return ResponseEntity.ok(user.orElse(new UserDto()));
    }

    @PostMapping("/balance-cash-in")
    public ResponseEntity<UserDto> balanceCashIn(@RequestBody
                                                 @Valid
                                                 @NotNull UserDto user) {
      return null;
    }



}
