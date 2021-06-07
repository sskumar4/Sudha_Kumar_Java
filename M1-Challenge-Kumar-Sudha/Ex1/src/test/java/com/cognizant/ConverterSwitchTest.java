package com.cognizant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch   converterSwich = new ConverterSwitch();
    @Test
    public void shouldReturnProperMonthNames() {
        //Equivalency test 1
        String whatIExpect = "January";
        String whatIGot;
        whatIGot = converterSwich.convertMonth(1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = "August";
        whatIGot = converterSwich.convertMonth(8);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = "December";
        whatIGot = converterSwich.convertMonth(12);
        assertEquals(whatIGot,whatIExpect);

    }

    @Test
    public void shouldReturnNullForInvalidArguments() {
        //Equivalency test 1
        String whatIExpect = null;
        String whatIGot;
        whatIGot = converterSwich.convertMonth(-1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = null;
        whatIGot = converterSwich.convertMonth(0);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = null;
        whatIGot = converterSwich.convertMonth(14);
        assertEquals(whatIGot,whatIExpect);

    }
    @Test
    public void shouldReturnProperDayNames() {
        //Equivalency test 1
        String whatIExpect = "Sunday";
        String whatIGot;
        whatIGot = converterSwich.convertDay(1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = "Wednesday";
        whatIGot = converterSwich.convertDay(4);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = "Friday";
        whatIGot = converterSwich.convertDay(6);
        assertEquals(whatIGot,whatIExpect);

    }



    @Test
    public void shouldReturnNullForWrongArguments() {
        //Equivalency test 1
        String whatIExpect = null;
        String whatIGot = null;
        whatIGot = converterSwich.convertDay(-1);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 2
        whatIExpect = null;
        whatIGot = converterSwich.convertDay(0);
        assertEquals(whatIGot,whatIExpect);

        //Equivalency test 3
        whatIExpect = null;
        whatIGot = converterSwich.convertDay(8);
        assertEquals(whatIGot,whatIExpect);

    }
}