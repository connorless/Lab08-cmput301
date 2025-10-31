package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        assertTrue(list.hasCity(edmonton));

        list.delete(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    /**
    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());
    }
    */
}