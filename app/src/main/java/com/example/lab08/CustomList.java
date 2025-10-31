package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from list if exists (copied over from lab6)
     * @param city
     * @throws
     * IllegalArgumentException if city is present in list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list.");
        }
        cities.remove(city);
    }
}
