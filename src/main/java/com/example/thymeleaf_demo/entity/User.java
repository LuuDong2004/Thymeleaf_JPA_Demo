package com.example.thymeleaf_demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
