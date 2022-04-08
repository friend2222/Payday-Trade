package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.exception.UserNotFoundException;
import com.example.userservice.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.userservice.constants.ErrorCodes.USER_NOT_FOUND;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }


    @Override
    public Optional<UserDto> getUserByName(String name) throws UserNotFoundException {
        boolean isUserExists = checkIfUserExists(name);
        if (isUserExists) {
            Optional<User> user = userRepo.findByName(name);
            if (user.isPresent()) {
                UserDto userDto = modelMapper.map(user.get(), UserDto.class);
                return Optional.of(userDto);
            }
        } else {
            throw UserNotFoundException.of(USER_NOT_FOUND.getMessage());
        }
    return null;
    }


    @Override
    public Optional<UserDto> updateBalance(UserDto userDto) throws UserNotFoundException {
        if (checkIfUserExists(userDto.getName())) {
            User user = modelMapper.map(userDto, User.class);
            userRepo.save(user);
            return Optional.of(userDto);
        } else {
            throw UserNotFoundException.of(USER_NOT_FOUND.getMessage());
        }

    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> userList = userRepo.findAll().stream()
                .map((s) -> modelMapper.map(s, UserDto.class))
                .collect(Collectors.toList());
        if (userList == null) return new ArrayList<UserDto>();
        return userList;
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = userRepo.save(modelMapper.map(userDto, User.class));
        if (user != null) return userDto;
        else return new UserDto();
    }


    private boolean checkIfUserExists(String name) {
        return userRepo.existsByName(name).isPresent();
    }


}
