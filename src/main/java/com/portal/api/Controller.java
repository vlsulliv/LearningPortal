package com.portal.api;

import com.portal.client.Users;
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

    ArrayList<Users> users = new ArrayList<>();

    @GetMapping
    public ArrayList<Users> testAPI() {
        return users;
    }

    @GetMapping("/")
    public String index() {
        return "Success, User added!";
    }

    @PostMapping
    public void addUser(Users user) {
        users.add(user);
    }

}
