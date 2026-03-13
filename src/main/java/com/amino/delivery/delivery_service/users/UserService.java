package com.amino.delivery.delivery_service.users;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserService{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto registerUser(UserDto user) {
        User user1 = fromDto(user);
        User saved = userRepository.save(user1);
        return toDto(saved);
    }

    public UserDto loginUser(String username, String password) {
        return null;
    }

    public UserDto logoutUser() {
        return null;
    }

    public UserProfile getUserProfile() {
        return null;
    }

    private UserDto toDto(User saved) {
        return null;
    }

    private User fromDto(UserDto user) {
        return null;
    }

}
