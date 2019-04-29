package test;

import jv.CharacterCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {

    CharacterCheck characterCheck;

    @Before
    public void setUp(){
        characterCheck = new CharacterCheck();
    }

    @After
    public void tearDown(){
        characterCheck = null;
    }

    @Test
    public void checkCharacterUpperCase() {
        String str = characterCheck.checkCharacter('A');

        assertEquals("Upper case letter",str);
    }

    @Test
    public void checkCharacterLowerCase() {
        String str = characterCheck.checkCharacter('a');

        assertEquals("Lower case letter",str);
    }

    @Test
    public void checkCharacterDigit() {
        String str = characterCheck.checkCharacter('6');

        assertEquals("Digit",str);
    }

    @Test
    public void checkCharacterSpecialCharacter() {
        String str = characterCheck.checkCharacter('&');

        assertEquals("Special characters",str);
    }

    @Test
    public void checkCharacterSpace() {
        String str = characterCheck.checkCharacter(' ');

        assertEquals("Special characters",str);
    }
}