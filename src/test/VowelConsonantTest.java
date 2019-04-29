package test;

import jv.VowelConsonant;
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

    @Test
    public void checkVowelOrConsonant() {

        String result = vowelConsonant.checkVowelConsonant("stackroute");

        assertEquals(" Consonant Consonant Vowel Consonant Consonant Consonant Vowel Vowel Consonant Vowel",result);
    }

    @Test(expected = NullPointerException.class)
    public void checkVowelOrConsonantNullPointerException() {

        String result = vowelConsonant.checkVowelConsonant(null);
    }
}