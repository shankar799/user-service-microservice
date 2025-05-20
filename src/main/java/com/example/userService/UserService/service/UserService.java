package com.example.userService.UserService.service;

import com.example.userService.UserService.entity.User;

public interface UserService {
    String registerUser(User user);
    String loginUser(String email, String password);
}
