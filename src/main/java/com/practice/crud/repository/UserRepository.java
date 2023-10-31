package com.practice.crud.repository;

import com.practice.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByUsernameAndEmail(String username, String email);

    // You can add custom queries if needed
}

