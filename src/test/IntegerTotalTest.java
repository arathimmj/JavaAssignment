package test;

import jv.IntegerTotal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerTotalTest {

    IntegerTotal integerTotal;

    @Before
    public void setUp() throws Exception {
        integerTotal = new IntegerTotal();
    }

    @After
    public void tearDown() throws Exception {
        integerTotal = null;
    }

    @Test
    public void findTotal() {
        int[] array = new int[]{10,23,45,67,89,0};


    }
}