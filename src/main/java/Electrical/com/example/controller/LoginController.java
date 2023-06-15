package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.LoginService;

@RestController
@RequestMapping("/electrical")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Optional<User> login(@RequestParam String username, @RequestParam String password) {
        return loginService.findByUsernameAndPassword(username, password);
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestParam String username) {
        return loginService.findByUsername(username);
    }

    @PostMapping("/reset")
    public void resetPassword(@RequestBody User user) {
        loginService.resetPassword(user.getUsername(), user.getPassword());
    }
    
    @PostMapping("/logout")
    public void logout(@RequestBody User user) {
        loginService.logout(user.getUsername());
    }
}