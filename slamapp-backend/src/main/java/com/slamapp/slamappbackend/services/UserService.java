package com.slamapp.slamappbackend.services;

import com.slamapp.slamappbackend.models.User;
import com.slamapp.slamappbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void authenticateUser(User user){
        userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        try {
            return userRepository.findByEmail(email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
