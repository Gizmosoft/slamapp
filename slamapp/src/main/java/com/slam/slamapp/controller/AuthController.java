package com.slam.slamapp.controller;

import com.slam.slamapp.service.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserData userData;

    @GetMapping
    public ModelAndView authenticateUser(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        if(oAuth2AuthenticationToken != null){
            Map<String, Object> userMap = oAuth2AuthenticationToken.getPrincipal().getAttributes();
            System.out.println("Sending user from AuthController to Service layer to get stored in DB");
            userData.addUserData(userMap);
            System.out.println("I have heard from service, model and repository layers that the user is added to DB");
//        ResponseEntity.ok("Hello from slam App");
        }
        // redirecting to the homepage
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    public boolean isUserAuthenticated(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken.isAuthenticated();
    }
}
