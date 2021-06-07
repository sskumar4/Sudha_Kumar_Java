package com.cognizant;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorObjectTest {
    private CalculatorObject calc = new CalculatorObject();


    @Test
    public void shouldReturnAddedValueFor2Integers() {
        int whatIExpect = 10;
        int whatIGot = calc.add(2, 8);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnSubtractedValueFor2Integers() {
        int whatIExpect = 3;
        int whatIGot = calc.subtract(5,2);
        assertEquals(whatIExpect, whatIGot);
    }


    @Test
    public void shouldReturnMultipliedValueFor2Integers() {
        int whatIExpect = 12;
        int whatIGot = calc.multiply(6,2);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDividedValueFor2Integers() {
        int whatIExpect = 12;
        int whatIGot = calc.divide(48,4);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnAddedValueFor2Doubles() {
        double whatIExpect = 10.0;
        double whatIGot = calc.add(2.0, 8.0);
        double delta = 0.001;
        assertEquals(whatIExpect, whatIGot, delta);
    }
    @Test
    public void shouldReturnSubtractedValueFor2Doubles() {
        double whatIExpect = 3;
        double whatIGot = calc.subtract(5,2);
        double delta = 0.00001;
        assertEquals(whatIExpect, whatIGot, delta);
    }

    @Test
    public void shouldReturnMultipliedValueFor2Doubles() {
        double whatIExpect = 12;
        double whatIGot = calc.multiply(6,2);
        double delta = 0.000001;
        assertEquals(whatIExpect, whatIGot, delta);
    }

    @Test
    public void shouldReturnDividedValueFor2Doubles() {
        int whatIExpect = 12;
        int whatIGot = calc.divide(48,4);
        double delta = 0.0000001;
        assertEquals(whatIExpect, whatIGot, delta);
    }
}