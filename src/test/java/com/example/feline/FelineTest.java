package com.example.feline;

import com.example.Feline;
import com.example.Predator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        Predator feline = new Feline();
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();
        assertEquals("ERROR! Invalid list of meat for feline",
                expectedMeat, actualMeat);
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        assertEquals("ERROR! Incorrect family for feline",
                "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        assertEquals("ERROR! Invalid number of kittens", 1, feline.getKittens());
    }
}