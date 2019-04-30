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


    public Result sortAndSum(int num) {

        int sum=0;

        int length = String.valueOf(num).length();

        result = numeralToArray.convertNumeralToArray(num);

        result =  arraySort.sortArray(result);

        result = arrayToNumeral.convertArrayToNumeral(result);

        for (int i=0;i<length;i++){
            if (checkEven.checkIfEven((result.array[i]))){
                result.sumOfEvenNos = result.sumOfEvenNos + result.array[i];
            }
        }
        if (result.sumOfEvenNos>15)
            result.moreThan15 = true;
        else
            result.moreThan15 = false;

        return result;
    }
}
