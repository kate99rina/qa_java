package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    private Feline feline;

    @Test
    public void checkException() {
        String expectedErrorMsg = "Используйте допустимые значения пола животного - самец или самка";
        Exception expectedException = Assert.assertThrows(Exception.class, () -> new Lion(feline, "test"));
        assertEquals("ERROR! Invalid exception message",
                expectedErrorMsg, expectedException.getMessage());
    }
}
