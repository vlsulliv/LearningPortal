package com.portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserProfileController {

    ArrayList<UserProfile> users = new ArrayList<>();

    @GetMapping
    public ArrayList<UserProfile> testAPI() {
        return users;
    }

    @PostMapping
    public void addUser(UserProfile user) {
        users.add(user);
    }
}
