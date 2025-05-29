package com.example.thymeleaf_demo.service;

import com.example.thymeleaf_demo.entity.User;
import com.example.thymeleaf_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
