package com.example.thymeleaf_demo.service;

import com.example.thymeleaf_demo.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUser(Integer id);
}
