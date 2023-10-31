package com.practice.crud.service;

import com.practice.crud.entity.User;
import com.practice.crud.dto.UserDTO;

public interface UserService {
    User registerUser(UserDTO userDTO);
}
