package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {
    private Cat cat;
    private Feline feline;

    @Before
    public void setUp() {
        feline = mock(Feline.class);
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, cat.getFood());
        verify(feline, times(1)).eatMeat();
    }

}
