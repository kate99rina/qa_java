package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void checkSound() {
        Cat cat = new Cat(feline);
        assertEquals("ERROR", "Мяу", cat.getSound());
    }

    @Test
    public void checkFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals("ERROR! Invalid list of food", expectedFood, cat.getFood());
    }

}