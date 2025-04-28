package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class CatParameterizedTest {
    private final String testSound;


    public CatParameterizedTest(String testSound) {
        this.testSound = testSound;

    }

    @Parameterized.Parameters
    public static Object[][] testSoundData() {
        return new Object[][]{
                {"Meow"},
                {"Амонгус"},
                {"Мяу"},
        };
    }

    @Test
    public void shouldBeSoundSimilar(){
        Cat cat = new Cat(new Feline());
        assertEquals(testSound, cat.getSound());
    }

}