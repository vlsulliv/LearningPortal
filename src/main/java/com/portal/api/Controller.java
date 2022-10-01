package com.portal.api;

import com.portal.client.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Annotation: RestController
 *
 * GET, PUT, POST, DELETE
 *
 * Class uses Spring MVC to handle web requests.
 *
 * @RestController will consume HTTP requests from the client and
 * send back the appropriate response. Indicates that the data returned
 * by each method will be written straight into the
 * response body instead of rendering a template.
 *
 */
@RequestMapping
@RestController
public class Controller {
    ArrayList<User> users = new ArrayList<>();

    @GetMapping
    public ArrayList<User> testAPI() {
        System.out.println(users);
        return users;
    }

    @GetMapping("/")
    public String index() {
        System.out.println("user");
        return "Success, User added!";
    }

    @PostMapping("/user")
    public void addUser(User user) {
        users.add(user);
        if (users.size() > 0) {
            System.out.println("user added to 'users' list");
        } else {
            System.out.println("user not added");
        }
    }

    @PutMapping("/users/{id}")
    public void update(User user, int id) {
        for(int i=0; i < users.size(); i++ ) {
            if (id == i) {
                users.remove(i);
                users.add(user);
            }
        }
        System.out.println("user " + user + "  replaced");
    }

    @DeleteMapping("/user/{id}")
    public void removeUser(User user) {
        users.remove(user);
        System.out.println("user " + user + " removed from 'users' list");
    }
}
