package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelConsonant {

//    make a string that has vowel or consonant for each letter of the string
    public String checkVowelConsonant(String str){

        String result = "";

        int length = str.length();

        for (int i=0;i<length;i++){
            if (Character.isLetter(str.charAt(i))){
                continue;
            }
            else{
                return "This string contains characters which are not letters";
            }
        }

        for(int i=0;i<length;i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                result = result + " Vowel";
            }
            else {
                result = result + " Consonant";

            }
        }
        return result;
    }
}
