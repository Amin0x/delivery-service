package com.amino.delivery.delivery_service.cart;

import com.amino.delivery.delivery_service.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}