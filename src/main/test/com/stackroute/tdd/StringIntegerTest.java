package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntegerTest {

    StringInteger stringInteger;
    @Before
    public void setUp() throws Exception {
        stringInteger = new StringInteger();
    }

    @After
    public void tearDown() throws Exception {
        stringInteger = null;
    }

//    Test the output with 0 as input
    @Test
    public void testRepeatStringWith0Test() {
        String str = stringInteger.repeatString("StackRoute", 0);

        assertEquals("StackRoute", str);
    }

//    Test the output with input out of bounds
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testRepeatStringWithStringIndexOutOfBoundExceptionTest() {
        String str = stringInteger.repeatString("StackRoute", 30);
    }

//    Test the output with input null
    @Test(expected = NullPointerException.class)
    public void testRepeatStringWithNullPointerExceptionTest() {
        String str = stringInteger.repeatString(null, 3);
    }
}