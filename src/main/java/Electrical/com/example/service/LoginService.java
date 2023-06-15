package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return loginRepository.findByUsernameAndPassword(username, password);
    }

    public Optional<User> findByUsername(String username) {
        return loginRepository.findByUsername(username);
    }
    
    public void resetPassword(String username, String newPassword) {
        loginRepository.resetPassword(username, newPassword);
    }
    
    public void logout(String username) {
        loginRepository.logout(username);
    }
    
}