package com.amino.delivery.delivery_service.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Register a new user
    @PostMapping("/users/register")
    public ResponseEntity<Map<String,Object>> registerUser(@RequestBody User user) {
        User registerUser = userService.registerUser(user);
        if (registerUser == null){
            throw new RuntimeException("");
        }
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value());
        response.put("message", "user created successfully");
        response.put("data", registerUser);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Login a user
    @PostMapping("/users/authenticate")
    public ResponseEntity<Map<String,Object>> loginUser(String username, String password) {
        User registerUser = userService.loginUser();
        if (registerUser == null){
            throw new RuntimeException("");
        }
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value());
        response.put("message", "user login successfully");
        response.put("data", registerUser);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/users/logout")
    public ResponseEntity<User> logoutUser(String userId) {
        return null;
    }

    @GetMapping("/users/profile")
    public ResponseEntity<UserProfile> getUserProfile(String userId) {
        return null;
    }

}
