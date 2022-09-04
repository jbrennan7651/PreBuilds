package com.bezkoder.spring.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.bezkoder.spring.login.models.User;
import com.bezkoder.spring.login.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth/signin")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
