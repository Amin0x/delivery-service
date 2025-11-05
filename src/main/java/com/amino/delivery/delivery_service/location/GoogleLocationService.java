package com.amino.delivery.delivery_service.location;

import org.springframework.stereotype.Service;

@Service
public interface GoogleLocationService {
    String getLocation(String address);
    String getDistance(String address1, String address2);
    String getDuration(String address1, String address2);
    String getRoute(String address1, String address2);
}
