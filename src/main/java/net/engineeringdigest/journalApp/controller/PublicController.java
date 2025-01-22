package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("health")
    public String healthCheck() {
        return "App is working fine";
    }

    @PostMapping("create-user")
    public void createUser(@RequestBody User user) {
//        userService.saveEntry(user);
        userService.saveNewUser(user);
    }
}
