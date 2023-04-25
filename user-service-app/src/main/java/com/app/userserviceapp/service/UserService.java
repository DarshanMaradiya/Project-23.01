package com.app.userserviceapp.service;

import com.app.userserviceapp.model.User;
import com.app.userserviceapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        user.setUsername(user.getEmailId());
        user = userRepository.save(user);
        return user;
    }

    public User getUserDetailsByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
