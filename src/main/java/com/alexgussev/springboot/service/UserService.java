package com.alexgussev.springboot.service;

import com.alexgussev.springboot.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public User getUserById(Long id);
    public void deleteUserById(Long id);
    public List<User> getAllUsers();


}
