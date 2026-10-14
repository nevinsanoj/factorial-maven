package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();

        assertEquals(120, factorial.findFactorial(5));
    }
}
