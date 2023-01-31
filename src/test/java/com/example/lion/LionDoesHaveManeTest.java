package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private String sex;
    private boolean doesHaveMane;
    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}
        };
    }

    public LionDoesHaveManeTest(String sex, boolean doesHaveMane) {
        this.sex = sex;
        this.doesHaveMane = doesHaveMane;
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals("ERROR! Invalid value of field doesHaveMane",
                doesHaveMane, lion.doesHaveMane());
    }
}
