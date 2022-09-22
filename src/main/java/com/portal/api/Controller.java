package com.portal.api;

import com.portal.model.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/*
 * Annotation: RestController
 *
 * Class uses Spring MVC to handle web requests.
 */
@RequestMapping
@RestController
public class Controller {

    ArrayList<UserProfile> users = new ArrayList<>();

    @GetMapping
    public ArrayList<UserProfile> testAPI() {
        return users;
    }

    @GetMapping("/")
    public String index() {
        return "Success, User added!";
    }

    @PostMapping
    public void addUser(UserProfile user) {
        users.add(user);
    }

}
