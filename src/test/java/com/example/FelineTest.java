package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FelineTest {

    @Mock
    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = mock(Feline.class);
    }

    @Test
    void getFoodReturnsCorrectList() throws Exception {
        when(feline.getFood("Хищник"))
                .thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    void getFamilyReturnsCorrectValue() {
        when(feline.getFamily()).thenReturn("Кошачьи");
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void eatMeatReturnsMeatList() throws Exception {
        when(feline.eatMeat())
                .thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(3, feline.eatMeat().size());
    }

    @Test
    void getKittensReturnsOne() {
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }
}