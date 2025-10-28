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

}
