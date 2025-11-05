package com.amino.delivery.delivery_service.users;

import org.springframework.stereotype.Service;

public interface UserService {
    User registerUser(User user);
    User loginUser();
    User logoutUser();
    UserProfile getUserProfile();
}
