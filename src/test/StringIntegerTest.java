package test;

import jv.StringInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntegerTest {

    StringInteger stringInteger;

    @Before
    public void setUp(){
        stringInteger = new StringInteger();
    }

    @After
    public void tearDown(){
        stringInteger = null;
    }

    @Test
    public void repeatString() {
        String str = stringInteger.repeatString("StackRoute", 3);

        assertEquals("StackRouteuteuteute", str);
    }

    @Test
    public void repeatStringWith0Test() {
        String str = stringInteger.repeatString("StackRoute", 0);

        assertEquals("StackRoute", str);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void repeatStringWithStringIndexOutOfBoundExceptionTest() {
        String str = stringInteger.repeatString("StackRoute", 30);
    }

    @Test(expected = NullPointerException.class)
    public void repeatStringWithNullPointerExceptionTest() {
        String str = stringInteger.repeatString(null, 3);
    }
}