package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    void testsHasCity() {
        CustomList list = new CustomList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }
    @Test
    void testsDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    void testsCountCities() {
        CustomList list = new CustomList();
        City city1 = new City("Toronto", "Ontario");
        City city2 = new City("Montreal", "Quebec");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(2, list.countCities());
    }

}
