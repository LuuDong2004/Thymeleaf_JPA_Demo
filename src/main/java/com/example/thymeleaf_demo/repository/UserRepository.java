package com.example.thymeleaf_demo.repository;

import com.example.thymeleaf_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
