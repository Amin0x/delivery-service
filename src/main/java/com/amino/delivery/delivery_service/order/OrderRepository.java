package com.amino.delivery.delivery_service.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findByOrderId(String orderId);
    Order findByUserId(String userId);
    Order findByStatus(String status);
    Order findByCreatedAt(LocalDateTime createdAt);
    Order findByUpdatedAt(LocalDateTime updatedAt);
}
