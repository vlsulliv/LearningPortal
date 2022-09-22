package com.portal.api;

import com.portal.model.UserProfile;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

/*
 * Annotation: RestController
 *
 * Class uses Spring MVC to handle web requests.
 *
 */
@RequestMapping
@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "Success, User added!";
    }


}
