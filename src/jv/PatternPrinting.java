package jv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PatternPrinting {

    public String printPattern(int lim){
        int i, j;

        String str = "";

        for(i=1; i<=lim; i++){
            for (j=0;j<i;j++){
                str = str + " " + i;
            }
        }

        return str;
    }
}
