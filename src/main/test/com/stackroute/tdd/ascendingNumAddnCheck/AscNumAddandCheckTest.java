package com.stackroute.tdd.ascendingNumAddnCheck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AscNumAddandCheckTest {

    AscNumAddandCheck ascNumAddandCheck;
    Result expectedResult;
    Result result;
    ArraySort arraySort;
    NumeralToArray numeralToArray;
    ArrayToNumeral arrayToNumeral;
    @Before
    public void setUp() throws Exception {
        ascNumAddandCheck = new AscNumAddandCheck();
        expectedResult = new Result();
        result=new Result();
        arraySort = new ArraySort();
        numeralToArray = new NumeralToArray();
        arrayToNumeral = new ArrayToNumeral();
    }

    @After
    public void tearDown() throws Exception {
        ascNumAddandCheck = null;
        expectedResult = null;
        result = null;
        arraySort = null;
        numeralToArray = null;
        arrayToNumeral = null;
    }

//    Check for the descending number and if the number is less than 15
    @Test
    public void testAscNumAddAndCheckTestLessThan15() {

        expectedResult.array = new int[]{5,4,3,2,1};
        expectedResult.finalNumber = 54321;
        expectedResult.sumOfEvenNos = 6;
        expectedResult.moreThan15 = false;

        result = ascNumAddandCheck.sortAndSum(12354);

        assertEquals(expectedResult.sumOfEvenNos,result.sumOfEvenNos);
        assertEquals(expectedResult.finalNumber, result.finalNumber);
        assertEquals(expectedResult.moreThan15,result.moreThan15);
        assertArrayEquals(expectedResult.array,result.array);
    }

//    Check for the descending number and if the number is more than 15
    @Test
    public void testAscNumAddAndCheckTestMoreThan15() {

        expectedResult.array = new int[]{8,8,6,6,1,1};
        expectedResult.finalNumber = 886611;
        expectedResult.sumOfEvenNos = 28;
        expectedResult.moreThan15 = true;

        result = ascNumAddandCheck.sortAndSum(188661);

        assertEquals(expectedResult.sumOfEvenNos,result.sumOfEvenNos);
        assertEquals(expectedResult.finalNumber, result.finalNumber);
        assertEquals(expectedResult.moreThan15,result.moreThan15);
        assertArrayEquals(expectedResult.array,result.array);
    }

//    Test if the array is sorted
    @Test
    public void testArraySorting(){
        expectedResult.array = new int[]{8,7,6,5,4};

        result.array = new int[]{4,6,8,5,7};

        result = arraySort.sortArray(result);

        assertArrayEquals(expectedResult.array,result.array);
    }

//    Test if the array is sorted with an empty array
    @Test
    public void testArraySortingWithEmptyArray(){
        expectedResult.array = new int[]{};

        result.array = new int[]{};

        result = arraySort.sortArray(result);

        assertArrayEquals(expectedResult.array,result.array);
    }

//    Test the numeral to array conversion
    @Test
    public void testNumeralToArrayConversion(){
        expectedResult.array = new int[]{7,5,8,6,4};

        result = numeralToArray.convertNumeralToArray(46857);

        assertArrayEquals(expectedResult.array,result.array);
    }

//    Test numeral to array conversion with 0 as input
    @Test
    public void testNumeralToArrayConversionWith0Input(){
        expectedResult.array = new int[]{0};

        result = numeralToArray.convertNumeralToArray(0);

        assertArrayEquals(expectedResult.array,result.array);
    }

//    Test array to numeral conversion
    @Test
    public void testArrayToNumeralConversion(){
        expectedResult.finalNumber = 46857;

        result.array = new int[]{4,6,8,5,7};

        result = arrayToNumeral.convertArrayToNumeral(result);

        assertEquals(expectedResult.finalNumber,result.finalNumber);
    }
}