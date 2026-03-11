package com.amino.delivery.delivery_service.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Request new delivery
    @PostMapping("/delivery/request")
    public void requestDelivery() {

    }

    // Track delivery
    @GetMapping("/delivery/{deliveryId}/track")
    public ResponseEntity<Order> trackDelivery(String deliveryId) {
        return null;
    }

    @PostMapping("/delivery/{deliveryId}/cancel")
    public void cancelDelivery(String deliveryId) {

    }

    @PostMapping("/delivery/{deliveryId}/location")
    public void updateDeliveryLocation(String deliveryId, String location) {

    }

    @PostMapping("/delivery/{deliveryId}/status")
    public void updateDeliveryStatus(String deliveryId, String status) {

    }
}
