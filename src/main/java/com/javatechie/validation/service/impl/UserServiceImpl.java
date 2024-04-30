package com.javatechie.validation.service.impl;

import com.javatechie.validation.dao.UserRepository;
import com.javatechie.validation.dto.UserRequest;
import com.javatechie.validation.entity.User;
import com.javatechie.validation.exception.UserNotFoundException;
import com.javatechie.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(UserRequest userRequest) {
        User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("user not found with id : " + id);
        }
    }

}
