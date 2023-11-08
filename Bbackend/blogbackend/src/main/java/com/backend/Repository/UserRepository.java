package com.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.blogbackend.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
}