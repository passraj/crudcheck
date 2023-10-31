package com.practice.crud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "data")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String lastName;
    private String email;
    private String password;
    private String mobile;

    // Getters and setters
}

