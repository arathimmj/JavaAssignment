package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tomJerry;

    @Before
    public void setUp() throws Exception {
        tomJerry = new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomJerry = null;
    }

//    Test even or odd with even input
    @Test
    public void checkEvenOddJerryTest() {
        String result = tomJerry.checkEvenOdd(24);

        assertEquals(result,"Jerry");
    }

//    Test even or odd with odd input
    @Test
    public void checkEvenOddTomTest() {
        String result = tomJerry.checkEvenOdd(23);

        assertEquals(result,"Tom");
    }
//    Test even or odd with less than 20 input
    @Test
    public void checkEvenOddLessThan20Test() {
        String result = tomJerry.checkEvenOdd(16);

        assertEquals(result,"Number less than 20 or greater than 30");
    }

//    Test even or odd with greater than 20 input
    @Test
    public void checkEvenOddTMoreThan30Test() {
        String result = tomJerry.checkEvenOdd(67);

        assertEquals(result,"Number less than 20 or greater than 30");
    }
}