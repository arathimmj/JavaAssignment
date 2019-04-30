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

    @Test
    public void testRepeatStringWith0Test() {
        String str = stringInteger.repeatString("StackRoute", 0);

        assertEquals("StackRoute", str);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testRepeatStringWithStringIndexOutOfBoundExceptionTest() {
        String str = stringInteger.repeatString("StackRoute", 30);
    }

    @Test(expected = NullPointerException.class)
    public void testRepeatStringWithNullPointerExceptionTest() {
        String str = stringInteger.repeatString(null, 3);
    }
}