package com.alexgussev.springboot.repository;

import com.alexgussev.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
