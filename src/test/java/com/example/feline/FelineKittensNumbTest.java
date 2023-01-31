package com.example.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensNumbTest {

    private int kittensNum;

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {0},
                {1},
                {10}
        };
    }

    public FelineKittensNumbTest(int kittensNum) {
        this.kittensNum = kittensNum;
    }

    @Test
    public void checkGetKittenCount() {
        Feline feline = new Feline();
        assertEquals("ERROR! Invalid number of kittens", kittensNum, feline.getKittens(kittensNum));
    }
}
