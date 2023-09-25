package com.example.behavioural.strategy.maps;
// Step2 Concrete strategies
public class TwoWheelerStrategy implements NavigationStrategy{
    @Override
    public Double navigate(String from, String to) {
        // Geocode the location
        // Distance between the locations
        // distance/speed
        return 2.0;
    }
}
