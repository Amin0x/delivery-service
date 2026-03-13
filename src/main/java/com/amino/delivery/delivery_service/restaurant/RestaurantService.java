package com.amino.delivery.delivery_service.restaurant;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService  {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public RestaurantDto createRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant = fromDto(restaurantDto);
        Restaurant saved = restaurantRepository.save(restaurant);
        return toDto(saved);
    }

    public RestaurantDto updateRestaurant(String restaurantId, RestaurantDto restaurantDto) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow();
        restaurant.setRestaurantType("");
        restaurant.setName("");
        restaurant.setStatus("");
        restaurant.setLocation("");
        restaurant.setUpdatedAt("");
        Restaurant saved = restaurantRepository.save(restaurant);
        return toDto(saved);
    }

    private RestaurantDto toDto(Restaurant restaurant) {
        return null;
    }

    private Restaurant fromDto(RestaurantDto restaurantDto) {
        return null;
    }

    public void deleteRestaurant(String id) {
        restaurantRepository.deleteById(id);
    }

    public RestaurantDto createRestaurantBranch(RestaurantDto restaurantDto) {
        return null;
    }
}
