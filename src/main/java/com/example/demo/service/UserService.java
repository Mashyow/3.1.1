package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    Object getUserId(long id);

    User removeUser(long id);

}