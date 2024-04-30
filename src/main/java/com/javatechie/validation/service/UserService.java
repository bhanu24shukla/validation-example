package com.javatechie.validation.service;

import com.javatechie.validation.dto.UserRequest;
import com.javatechie.validation.entity.User;
import com.javatechie.validation.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    User saveUser(UserRequest userRequest);

    List<User> getAllUsers();

    User getUser(int id) throws UserNotFoundException;
}
