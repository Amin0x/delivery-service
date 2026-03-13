package com.amino.delivery.delivery_service.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/request")
    public void requestDelivery() {

    }

    // Track delivery
    @GetMapping("/{deliveryId}/track")
    public ResponseEntity<Order> trackDelivery(String deliveryId) {
        return null;
    }

    @PostMapping("/{deliveryId}/cancel")
    public void cancelDelivery(String deliveryId) {

    }

    @PostMapping("/{deliveryId}/location")
    public void updateDeliveryLocation(String deliveryId, String location) {

    }

    @PostMapping("/{deliveryId}/status")
    public void updateDeliveryStatus(String deliveryId, String status) {

    }
}
