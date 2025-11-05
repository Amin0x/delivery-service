package com.amino.delivery.delivery_service.restaurant;

import org.springframework.stereotype.Service;

public interface RestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(String restaurantId, Restaurant restaurant);
}
