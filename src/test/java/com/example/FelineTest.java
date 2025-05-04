package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class FelineTest {

    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void getFoodReturnsCorrectList() throws Exception {
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFoodList, feline.eatMeat());
    }

    @Test
    void getFamilyReturnsCorrectValue() {
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    void getCorrectSizeOfMeatList() throws Exception {
        int expectedSizeOfList = 3;
        assertEquals(expectedSizeOfList, feline.eatMeat().size());
    }

    @Test
    void getKittensReturnsOne() {
        int expectedNumberOfKittens = 1;
        assertEquals(expectedNumberOfKittens, feline.getKittens());
    }
}