package com.cognizant;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    private ConverterIf converterIf = new ConverterIf();

    @Test
    public void shouldReturnProperMonthNames() {
        //Equivalency test 1
        String whatIExpect = "January";
        String whatIGot;
        whatIGot = converterIf.convertMonth(1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = "August";
        whatIGot = converterIf.convertMonth(8);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = "December";
        whatIGot = converterIf.convertMonth(12);
        assertEquals(whatIGot,whatIExpect);

    }

    @Test
    public void shouldReturnNullForInvalidArguments() {
        //Equivalency test 1
        String whatIExpect = null;
        String whatIGot;
        whatIGot = converterIf.convertMonth(-1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = null;
        whatIGot = converterIf.convertMonth(0);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = null;
        whatIGot = converterIf.convertMonth(14);
        assertEquals(whatIGot,whatIExpect);

    }
    @Test
    public void shouldReturnProperDayNames() {
        //Equivalency test 1
        String whatIExpect = "Sunday";
        String whatIGot;
        whatIGot = converterIf.convertDay(1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = "Wednesday";
        whatIGot = converterIf.convertDay(4);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = "Friday";
        whatIGot = converterIf.convertDay(6);
        assertEquals(whatIGot,whatIExpect);

    }



    @Test
    public void shouldReturnNullForWrongArguments() {
        //Equivalency test 1
        String whatIExpect = null;
        String whatIGot = null;
        whatIGot = converterIf.convertDay(-1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = null;
        whatIGot = converterIf.convertDay(0);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = null;
        whatIGot = converterIf.convertDay(8);
        assertEquals(whatIGot,whatIExpect);

    }
}