package com.chessworld.puzzler.service;

import com.chessworld.puzzler.model.User;
import com.chessworld.puzzler.repository.UserRepository;
import org.springframework.stereotype.Service;

// *** Dependency Injection !
@Service // Spring sees and knows to populate indicated userRepository w/ functional interface
public class UserService {

    private UserRepository userRepository; // make space for incoming functional interface

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository; // set spaceholder to incoming
    }

    public User addUser() {
        User user = new User();
        user.setName("user");
        return userRepository.save(user);
    }
}
