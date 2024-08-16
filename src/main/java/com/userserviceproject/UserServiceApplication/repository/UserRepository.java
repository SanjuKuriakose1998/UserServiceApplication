package com.userserviceproject.UserServiceApplication.repository;

import com.userserviceproject.UserServiceApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
