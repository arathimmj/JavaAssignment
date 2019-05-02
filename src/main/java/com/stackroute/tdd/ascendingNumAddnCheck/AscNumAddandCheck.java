package com.stackroute.tdd.ascendingNumAddnCheck;

import com.stackroute.tdd.ascendingNumAddnCheck.ArraySort;
import com.stackroute.tdd.ascendingNumAddnCheck.ArrayToNumeral;
import com.stackroute.tdd.ascendingNumAddnCheck.NumeralToArray;
import com.stackroute.tdd.ascendingNumAddnCheck.Result;
import com.stackroute.tdd.palindrome.CheckEven;


public class AscNumAddandCheck {

    Result result = new Result();

    CheckEven checkEven = new CheckEven();

    NumeralToArray numeralToArray = new NumeralToArray();

    ArraySort arraySort = new ArraySort();

    ArrayToNumeral arrayToNumeral = new ArrayToNumeral();


    //Re-arrange a number in descending order and check if the sum of the even digits is greater than 15
    public Result sortAndSum(int num) {

        int sum=0;

        int length = String.valueOf(num).length();      //find the number of digits in the number

        result = numeralToArray.convertNumeralToArray(num);     //converted numeral to array

        result =  arraySort.sortArray(result);      //sorted array

        result = arrayToNumeral.convertArrayToNumeral(result);      //convert numeral to array

        //finding the sum of even numbers
        for (int i=0;i<length;i++){
            if (checkEven.checkIfEven((result.array[i]))){
                result.sumOfEvenNos = result.sumOfEvenNos + result.array[i];
            }
        }

        //check if the sum of even numbers is greater than 15
        if (result.sumOfEvenNos>15)
            result.moreThan15 = true;
        else
            result.moreThan15 = false;

        return result;
    }
}
