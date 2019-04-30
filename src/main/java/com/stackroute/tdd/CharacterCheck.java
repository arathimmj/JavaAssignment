package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterCheck {

    public String checkCharacter(char ch) {
        if (Character.isLowerCase(ch)){
            return "Lower case letter";
        }
        else if(Character.isUpperCase(ch)){
            return "Upper case letter";
        }
        else if (Character.isDigit(ch)){
            return "Digit";
        }
        else{
            return "Special characters";
        }
    }
}
