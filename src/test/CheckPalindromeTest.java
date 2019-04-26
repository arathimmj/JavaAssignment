package test;

import jv.palindrome.CheckEven;
import jv.palindrome.EvenDigitSum;
import org.junit.Before;
import org.junit.Test;

import jv.palindrome.CheckPalindrome;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome checkPalindrome;
    EvenDigitSum evenDigitSum;
    CheckEven checkEven;

    @Before
    public void setUp(){
        checkPalindrome = new CheckPalindrome();
        checkEven = new CheckEven();
        evenDigitSum = new EvenDigitSum();
    }

    @Test
    public void palindromeWithEvenLessThan25() {

        int checker = checkPalindrome.palindromeCheck(123321);

        assertEquals(1,checker);
    }

    @Test
    public void palindromeWithEvenMoreThan25(){

        int checker = checkPalindrome.palindromeCheck(1886881);

        assertEquals(0,checker);
    }

    @Test
    public void palindromeNot(){

        int checker = checkPalindrome.palindromeCheck(123421);

        assertEquals(2,checker);
    }

    @Test
    public void evenDigitSum(){
        int sum = evenDigitSum.findEvenNoSum(1884883881);

        assertEquals(52,sum);
    }

    @Test
    public void evenCheckEven(){

        boolean checker = checkEven.checkIfEven(6);

        assertEquals(true,checker);
    }

    @Test
    public void evenCheckOdd(){

        boolean checker = checkEven.checkIfEven(5);

        assertEquals(false,checker);
    }
}