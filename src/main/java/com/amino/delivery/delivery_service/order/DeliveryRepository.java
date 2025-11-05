package com.amino.delivery.delivery_service.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface DeliveryRepository extends JpaRepository<Delivery, String> {
    Delivery findByOrderId(String orderId);
    Delivery findByUserId(String userId);
    Delivery findByStatus(String status);
    Delivery findByCreatedAt(LocalDateTime createdAt);
    Delivery findByUpdatedAt(LocalDateTime updatedAt);
}
