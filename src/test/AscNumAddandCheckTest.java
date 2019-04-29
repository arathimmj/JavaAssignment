package test;

import jv.ascendingNumAddnCheck.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class AscNumAddandCheckTest {

    AscNumAddandCheck ascNumAddandCheck;
    Result expectedResult;
    Result result;
    ArraySort arraySort;
    NumeralToArray numeralToArray;
    ArrayToNumeral arrayToNumeral;

    @Before
    public void setup(){

        ascNumAddandCheck = new AscNumAddandCheck();
        expectedResult = new Result();
        result=new Result();
        arraySort = new ArraySort();
        numeralToArray = new NumeralToArray();
        arrayToNumeral = new ArrayToNumeral();
    }

    @After
    public void tearDown(){
        ascNumAddandCheck = null;
        expectedResult = null;
        result = null;
        arraySort = null;
        numeralToArray = null;
        arrayToNumeral = null;
    }
    @Test
    public void ascNumAddAndCheckTestLessThan15() {

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

    @Test
    public void ascNumAddAndCheckTestMoreThan15() {

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

    @Test
    public void arraySorting(){
        expectedResult.array = new int[]{8,7,6,5,4};

        result.array = new int[]{4,6,8,5,7};

        result = arraySort.sortArray(result);

        assertArrayEquals(expectedResult.array,result.array);
    }

    @Test
    public void arraySortingWithEmptyArray(){
        expectedResult.array = new int[]{};

        result.array = new int[]{};

        result = arraySort.sortArray(result);

        assertArrayEquals(expectedResult.array,result.array);
    }

    @Test
    public void numeralToArrayConversion(){
        expectedResult.array = new int[]{7,5,8,6,4};

        result = numeralToArray.convertNumeralToArray(46857);

        assertArrayEquals(expectedResult.array,result.array);
    }

    @Test
    public void numeralToArrayConversionWith0Input(){
        expectedResult.array = new int[]{0};

        result = numeralToArray.convertNumeralToArray(0);

        assertArrayEquals(expectedResult.array,result.array);
    }

    @Test
    public void arrayToNumeralConversion(){
        expectedResult.finalNumber = 46857;

        result.array = new int[]{4,6,8,5,7};

        result = arrayToNumeral.convertArrayToNumeral(result);

        assertEquals(expectedResult.finalNumber,result.finalNumber);
    }
}