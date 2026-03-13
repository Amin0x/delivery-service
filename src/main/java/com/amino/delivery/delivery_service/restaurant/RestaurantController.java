package com.amino.delivery.delivery_service.restaurant;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public RestaurantDto create(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.createRestaurant(restaurantDto);
    }

    @PutMapping("/{id}")
    public RestaurantDto update(@PathVariable String id, @RequestBody RestaurantDto restaurantDto){
        return restaurantService.updateRestaurant(id, restaurantDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        restaurantService.deleteRestaurant(id);
    }

    @PostMapping("/{id}/branches")
    public RestaurantDto createBranch(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.createRestaurantBranch(restaurantDto);
    }
}
