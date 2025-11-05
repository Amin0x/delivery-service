package com.amino.delivery.delivery_service.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantBranchRepository extends JpaRepository<RestaurantBranch, String> {
    // Custom query methods can be defined here if needed
}
