package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionTest {

    private String sex;
    @Mock
    private Feline feline;

    public LionTest(String sex) {
        this.sex = sex;
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самка"},
                {"Самец"}
        };
    }

    @Test
    public void checkKittens() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("ERROR! Invalid number of kittens", 1, lion.getKittens());
    }

    @Test
    public void checkFood() throws Exception {
        Lion lion = new Lion(feline, sex);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        assertEquals("ERROR! Invalid list of food for lion", expectedFood, actualFood);
    }

}