package com.stackroute.tdd.palindrome;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome checkPalindrome;
    EvenDigitSum evenDigitSum;
    CheckEven checkEven;

    @Before
    public void setUp() throws Exception {
        checkPalindrome = new CheckPalindrome();
        checkEven = new CheckEven();
        evenDigitSum = new EvenDigitSum();
    }

    @After
    public void tearDown() throws Exception {
        checkPalindrome = null;
        checkEven = null;
        evenDigitSum = null;
    }

//    Test for palindrome with an even input less than 25
    @Test
    public void testPalindromeWithEvenLessThan25() {

        int checker = checkPalindrome.palindromeCheck(123321);

        assertEquals(1,checker);
    }

//    Test for palindrome with an even input more than 25
    @Test
    public void testPalindromeWithEvenMoreThan25(){

        int checker = checkPalindrome.palindromeCheck(1886881);

        assertEquals(0,checker);
    }

//    Test for palindrome with an even input which is not palindrom
    @Test
    public void testPalindromeNot(){

        int checker = checkPalindrome.palindromeCheck(123421);

        assertEquals(2,checker);
    }

//    Test the even digit sum
    @Test
    public void testEvenDigitSum(){
        int sum = evenDigitSum.findEvenNoSum(1884883881);

        assertEquals(52,sum);
    }

//    Test for even or odd with even input
    @Test
    public void testEvenCheckEven(){

        boolean checker = checkEven.checkIfEven(6);

        assertEquals(true,checker);
    }

//    Test for even or odd with odd input
    @Test
    public void testEvenCheckOdd(){

        boolean checker = checkEven.checkIfEven(5);

        assertEquals(false,checker);
    }
}