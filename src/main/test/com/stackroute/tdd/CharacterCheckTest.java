package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {

    CharacterCheck characterCheck;

    @Before
    public void setUp() throws Exception {
        characterCheck = new CharacterCheck();
    }

    @After
    public void tearDown() throws Exception {
        characterCheck = null;
    }

//    checks for upper case
    @Test
    public void testCheckCharacterUpperCase() {
        String str = characterCheck.checkCharacter('A');

        assertEquals("Upper case letter",str);
    }

//    checks for lower case
    @Test
    public void testCheckCharacterLowerCase() {
        String str = characterCheck.checkCharacter('a');

        assertEquals("Lower case letter",str);
    }

//    check digit
    @Test
    public void testCheckCharacterDigit() {
        String str = characterCheck.checkCharacter('6');

        assertEquals("Digit",str);
    }

//    chack special character
    @Test
    public void testCheckCharacterSpecialCharacter() {
        String str = characterCheck.checkCharacter('&');

        assertEquals("Special characters",str);
    }

//    check space
    @Test
    public void testCheckCharacterSpace() {
        String str = characterCheck.checkCharacter(' ');

        assertEquals("Special characters",str);
    }
}