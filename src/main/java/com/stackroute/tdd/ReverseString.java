package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

    public String reverseString(String str) throws Exception{

        String revStr="";
        int len;

        try{
            len = str.length();
        }
        catch (Exception e){
            System.out.println("Throwing");
            throw e;
        }
        char[] charArray = str.toCharArray();

        for (int i=len-1;i>=0;i--){
            revStr = revStr + charArray[i];
        }

        return revStr;
    }
}
