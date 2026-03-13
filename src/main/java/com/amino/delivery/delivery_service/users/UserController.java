package com.amino.delivery.delivery_service.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<Map<String,Object>> registerUser(@RequestBody UserDto user) {
        UserDto userDto = userService.registerUser(user);
        if (userDto == null){
            return ResponseEntity.badRequest().build();
        }
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value());
        response.put("message", "user created successfully");
        response.put("data", userDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Login a user
    @PostMapping("/authenticate")
    public ResponseEntity<Map<String,Object>> loginUser(@RequestParam String username, @RequestParam String password) {
        UserDto registerUser = userService.loginUser(username, password);
        if (registerUser == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value());
        response.put("message", "user login successfully");
        response.put("data", registerUser);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<User> logoutUser(String userId) {
        return null;
    }

    @GetMapping("/profile")
    public ResponseEntity<UserProfile> getUserProfile(String userId) {
        return null;
    }

}
