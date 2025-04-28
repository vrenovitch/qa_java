package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final String getFamilyTest;


    public FelineParameterizedTest(String getFamilyTest) {
        this.getFamilyTest = getFamilyTest;

    }

    @Parameterized.Parameters
    public static Object[][] testGetFamilyTest() {
        return new Object[][]{
                {"Собачьи"},
                {"Кошачьи"},
                {"Мышачьи"}
        };
    }

    @Test
    public void shouldBeNamedSimilar() {
        Feline feline = new Feline();
        assertEquals(getFamilyTest, feline.getFamily());
    }

}