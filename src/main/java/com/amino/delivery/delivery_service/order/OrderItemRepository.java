package com.amino.delivery.delivery_service.order;

import com.amino.delivery.delivery_service.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
    @Query("SELECT o FROM OrderItem o WHERE o.orderId = ?1 AND o.productId = ?2")
    Optional<OrderItem> findByOrderAndProduct(String orderId, String productId);
}