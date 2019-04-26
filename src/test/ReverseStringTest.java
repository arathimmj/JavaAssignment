package test;

import jv.ReverseString;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp(){
        reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {

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

    @Test(expected = NullPointerException.class)
    public void reverseStringWithNull() throws Exception{

        String expectedStr = "";
        String revStr = "";

            revStr = reverseString.reverseString(null);
    }
}