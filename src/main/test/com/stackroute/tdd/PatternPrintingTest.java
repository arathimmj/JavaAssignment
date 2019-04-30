package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternPrintingTest {

    PatternPrinting patternPrinting;

    @Before
    public void setUp() throws Exception {
        patternPrinting = new PatternPrinting();
    }

    @After
    public void tearDown() throws Exception {
        patternPrinting = null;
    }

    @Test
    public void testPrintPattern(){

        String str = patternPrinting.printPattern(6);

        assertEquals(" 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6", str);
    }

    @Test
    public void testPrintPatternWithLimit0(){

        String str = patternPrinting.printPattern(0);

        assertEquals("", str);
    }

}