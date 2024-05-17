package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 4);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
