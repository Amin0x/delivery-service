package com.amino.delivery.delivery_service.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhone(String phone);
    User findByRole(String role);
    User findByStatus(String status);
    User findByCreatedAt(String createdAt);
    User findByUpdatedAt(String updatedAt);
}
