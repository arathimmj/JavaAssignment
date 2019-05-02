package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TomJerry {

//    if the element is even return jerry else return tom
    public String checkEvenOdd(int num){
        if (num>20 && num<30) {
            if (num%2==0)
                return "Jerry";
            else
                return "Tom";
        }
        else
            return "Number less than 20 or greater than 30";
    }
}
