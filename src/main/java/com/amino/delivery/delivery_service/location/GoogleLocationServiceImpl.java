package com.amino.delivery.delivery_service.location;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

public class GoogleLocationServiceImpl implements GoogleLocationService {

    private static final String DIRECTIONS_API_URL = "https://maps.googleapis.com/maps/api/directions/json";

    private final RestTemplate restTemplate = new RestTemplate();

    private final String apiKey = "YOUR_API_KEY";  // better inject via config

    @Override
    public String getLocation(String address) {

        return "Location: " + address;
    }

    @Override
    public String getDistance(String address1, String address2) {
        return "Distance: " + address1 + " - " + address2;
    }

    @Override
    public String getDuration(String address1, String address2) {
        return "Duration: " + address1 + " - " + address2;
    }

    @Override
    public String getRoute(String origin, String destination) {
        URI uri = UriComponentsBuilder.fromUriString(DIRECTIONS_API_URL)
                .queryParam("origin", origin)            // e.g. "New York,NY"
                .queryParam("destination", destination)  // e.g. "Los Angeles,CA"
                .queryParam("key", apiKey)
                .build()
                .encode()
                .toUri();

        // This will return JSON string directly
        return restTemplate.getForObject(uri, String.class);
    }

    private Long getDistanceInMeters(String jsonResponse) {
        // Parse the JSON response to extract distance in meters
        // This is a placeholder; you would use a JSON library like Jackson or Gson to parse the response
        // For example, you might look for "distance" in the JSON structure

        return 0L; // Replace with actual parsing logic
    }

    private Long getDurationInSeconds(String jsonResponse) {
        // Parse the JSON response to extract duration in seconds
        // This is a placeholder; you would use a JSON library like Jackson or Gson to parse the response
        // For example, you might look for "duration" in the JSON structure

        return 0L; // Replace with actual parsing logic
    }

    private List<String> getRouteSteps(String jsonResponse) {
        // Parse the JSON response to extract route steps
        // This is a placeholder; you would use a JSON library like Jackson or Gson to parse the response
        // For example, you might look for "steps" in the JSON structure

        return List.of(); // Replace with actual parsing logic
    }
}
