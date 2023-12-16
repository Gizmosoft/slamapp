package com.slam.slamapp.controller;

import com.slam.slamapp.model.User;
import com.slam.slamapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/finduser")
    public Optional<User> findUserById(String id){
        Optional<User> siteuser = userRepository.findById(id);
        System.out.println(siteuser);
        return siteuser;
    }

    @PostMapping("/adduser")
    public @ResponseBody String addUserToDB(ArrayList<String> userList){
        Optional<User> userSearch = findUserById(userList.get(0));
        if(userSearch.isEmpty()){
            User user = new User();
            user.setId(userList.get(0));
            user.setName(userList.get(1));
            user.setEmail(userList.get(2));
            userRepository.save(user);
            return "User Controller Response: New User saved to the DB";
        }
        else {
            return "User Controller Response: User already existed in the system, continuing with login...";
        }
    }
}
