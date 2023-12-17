package com.slamapp.slamappbackend.controllers;

import com.slamapp.slamappbackend.models.User;
import com.slamapp.slamappbackend.requests.UserRequest;
import com.slamapp.slamappbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/oauth")
    public ResponseEntity<String> authenticate(@RequestBody User user) {
        try {
            userService.authenticateUser(user);
            return new ResponseEntity<>("User Authenticated Successfully", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("Error Authenticating User", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/oauth/{email}")
    public ResponseEntity<User> getUser(@PathVariable String email) {
        try {
            User user = userService.getUserByEmail(email);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
