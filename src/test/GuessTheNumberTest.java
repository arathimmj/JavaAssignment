package test;

import jv.GuessTheNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {

    GuessTheNumber guessTheNumber;
    @Before
    public void setUp() throws Exception {
        guessTheNumber = new GuessTheNumber();
    }

    @After
    public void tearDown() throws Exception {
        guessTheNumber = null;
    }

    @Test
    public void checkMatch() throws Exception {
        int min = 0, max = 100;
        int guess = min + (int)(Math.random() * ((max - min) + 1));
        String result = guessTheNumber.checkMatch(guess, 55);

        while (result != "The number guessed matches the original number"){

            if (result == "The number guessed is more than the original number"){

                max = guess;
                guess = min + (int)(Math.random() * ((max - min) + 1));
                result = guessTheNumber.checkMatch(guess,55);

            }
            else if (result == "The number guessed is less than the original number"){

                min = guess;
                guess = min + (int)(Math.random() * ((max - min) + 1));
                result = guessTheNumber.checkMatch(guess,55);
            }
        }
        assertEquals(result, "The number guessed matches the original number");

    }

    @Test
    public void checkMatchLessThan0OrGreaterThan100() throws Exception {

        String result = guessTheNumber.checkMatch(45, 5100);

        assertEquals(result, "The number is less than 0 or greater than 100");

    }
}