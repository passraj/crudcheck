package com.practice.crud.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String lastName;
    private String email;
    private String password;
    private String mobile;

    // Getters and setters
}
