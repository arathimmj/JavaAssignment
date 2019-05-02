package com.stackroute.tdd.ascendingNumAddnCheck;

//Convert numeral to Array
public class NumeralToArray {

    Result result = new Result();

    public Result convertNumeralToArray(int num){

        int i=0;

        int length = String.valueOf(num).length();

        result.array = new int[length];

        while (num/10 != 0) {
            result.array[i] = num%10;
            num=num/10;
            i++;
        }
        result.array[i] = num;

        return result;
    }
}
