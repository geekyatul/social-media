package com.machine.coding.socialmedia.service;

import com.machine.coding.socialmedia.entitie.User;

import java.util.List;

public interface UserService {
    User createUser(String name, String email);
    List<User> getAllUsers();
}
