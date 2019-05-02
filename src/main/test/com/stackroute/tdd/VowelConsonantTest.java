package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;

    @Before
    public void setUp() throws Exception {
        vowelConsonant = new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonant = null;
    }

//    Test if the string returned is correct for the vowel and consonant allocation
    @Test
    public void checkVowelOrConsonant() {

        String result = vowelConsonant.checkVowelConsonant("stackroute");

        assertEquals(" Consonant Consonant Vowel Consonant Consonant Consonant Vowel Vowel Consonant Vowel",result);
    }

//    Test if a null pointer exception is thrown for null inputs
    @Test(expected = NullPointerException.class)
    public void checkVowelOrConsonantNullPointerException() {

        String result = vowelConsonant.checkVowelConsonant(null);
    }
}