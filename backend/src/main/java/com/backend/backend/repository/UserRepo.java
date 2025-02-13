package com.backend.backend.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

    Optional<Users> findByEmail(String email);
}
