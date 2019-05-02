package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        reverseString = null;
    }

//    Test the reverse of the string
    @Test
    public void testReverseString() {

        String expectedStr = "gnirtSmodnaR";
        String revStr="";

        try {
            revStr = reverseString.reverseString("RandomString");
        }
        catch (Exception e){
            System.out.println(e);
        }

        assertEquals(expectedStr,revStr);
    }

//    Test the reverse of the string with null input
    @Test(expected = NullPointerException.class)
    public void testReverseStringWithNull() throws Exception{

        String expectedStr = "";
        String revStr = "";

        revStr = reverseString.reverseString(null);
    }
}