package com.amino.delivery.delivery_service.order;

import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public Delivery requestDelivery(Delivery delivery) {
        return delivery;
    }

    @Override
    public Delivery trackDelivery(String deliveryId) {
        return null;
    }

    @Override
    public void cancelDelivery(String deliveryId) {

    }

    @Override
    public void updateDeliveryLocation(String deliveryId, String location) {

    }

    @Override
    public void updateDeliveryStatus(String deliveryId, String status) {

    }
}
