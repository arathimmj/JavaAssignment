package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessTheNumber {

//    check if the input number is a match
    public   String checkMatch(int guess, int num) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (num < 0 || num > 100){
            return "The number is less than 0 or greater than 100";
        }
        if (guess != num){
            if (guess>num)
                return "The number guessed is more than the original number";
            else if (guess<num)
                return "The number guessed is less than the original number";
            guess=Integer.parseInt(br.readLine());
            checkMatch(guess, num);
        }

        return "The number guessed matches the original number";
    }
}
