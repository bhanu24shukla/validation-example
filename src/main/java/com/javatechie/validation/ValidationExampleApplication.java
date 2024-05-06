package com.javatechie.validation;

import com.javatechie.validation.dao.UserRepository;
import com.javatechie.validation.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ValidationExampleApplication {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
        User userRequest1 = User.builder()
                .name("Bhanu Shukla")
                .age(27)
                .email("bhanu24shukla@gmail.com")
                .gender("Male")
                .nationality("Indian")
                .mobile("9870893657")
                .build();
        User userRequest2 = User.builder()
                .name("Aman Shukla")
                .age(24)
                .email("aman.shukla@gmail.com")
                .gender("Male")
                .nationality("Indian")
                .mobile("123456789")
                .build();
        User userRequest3 = User.builder()
                .name("Akash Shukla")
                .age(25)
                .email("akash.shukla@gmail.com")
                .gender("Male")
                .nationality("Indian")
                .mobile("987654321")
                .build();
        User userRequest4 = User.builder()
                .name("Shubham Shukla")
                .age(28)
                .email("shubham24shukla@gmail.com")
                .gender("Male")
                .nationality("Indian")
                .mobile("8958484756")
                .build();
        userRepository.saveAll(Arrays.asList(userRequest1, userRequest2, userRequest3, userRequest4));
    }

    public static void main(String[] args) {
        SpringApplication.run(ValidationExampleApplication.class, args);
    }

}
