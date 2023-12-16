package com.slam.slamapp.service;

import com.slam.slamapp.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class UserDataImpl implements UserData{

    @Autowired
    UserController userController;

    @Override
    public void addUserData(Map<String, Object> userMap) {
        if(!userMap.isEmpty()){
            ArrayList<String> userList = new ArrayList<>();

            // get the required fields to be stored in DB
            userList.add(userMap.get("sub").toString());
            userList.add(userMap.get("name").toString());
            userList.add(userMap.get("email").toString());

            System.out.println(userList);

            // pass the userList to be stored in DB
            String controllerResponse = userController.addUserToDB(userList);
            System.out.println(controllerResponse);
        }
    }
}
