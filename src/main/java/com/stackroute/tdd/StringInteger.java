package com.stackroute.tdd;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringInteger {

//    print the last n characters of a string n times
    public String repeatString(String str, int num){
        int length = str.length();

        String addStr = str.substring(length-num,length);

        for (int i=0;i<num;i++)
            str = str + addStr;

        return str;
    }
}
