package com.amino.delivery.delivery_service.order;

import org.springframework.stereotype.Service;


public interface DeliveryService {
    Delivery requestDelivery(Delivery delivery);
    Delivery trackDelivery(String deliveryId);
    void cancelDelivery(String deliveryId);
    void updateDeliveryLocation(String deliveryId, String location);
    void updateDeliveryStatus(String deliveryId, String status);
}
