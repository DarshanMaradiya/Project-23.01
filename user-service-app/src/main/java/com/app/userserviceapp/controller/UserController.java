package com.app.userserviceapp.controller;

import com.app.userserviceapp.model.User;
import com.app.userserviceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String greetings() {
        return "Welcome to UserService";
    }

    @PostMapping("/add")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
        user = userService.createUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserDetail(@PathVariable("username") String username) {
        User user = userService.getUserDetailsByUsername(username);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<UsersList> getAllUsersDetail() {
        Iterable<User> users = userService.getAllUsers();
        UsersList usersList = new UsersList(users);
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }
}