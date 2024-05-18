package com.chessworld.puzzler.controller;

import com.chessworld.puzzler.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // telling Spring this class will have endpoints
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity addUser() {
        return ResponseEntity.ok(userService.addUser());
    }
}
