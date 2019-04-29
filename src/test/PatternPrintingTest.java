package test;

import jv.PatternPrinting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternPrintingTest {
;

    PatternPrinting patternPrinting;

    @Before
    public void setUp(){
        patternPrinting = new PatternPrinting();
    }

    @After
    public void tearDown(){
        patternPrinting = null;
    }

    @Test
    public void printPattern(){

        String str = patternPrinting.printPattern(6);

        assertEquals(" 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6", str);
    }

    @Test
    public void printPatternWithLimit0(){

        String str = patternPrinting.printPattern(0);

        assertEquals("", str);
    }

}