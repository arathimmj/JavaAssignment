package com.stackroute.tdd.ascendingNumAddnCheck;

import com.stackroute.tdd.ascendingNumAddnCheck.Result;

//Sort the array in non-increasing order
public class ArraySort {
    public Result sortArray(Result result){
        int length,i,j,temporary;
        length = result.array.length;

//        Bubble sort in non-increasing order
        for (i=0;i<length;i++){
            for (j=i+1;j<length;j++){
                if (result.array[j]>result.array[i]){
                    temporary=result.array[j];
                    result.array[j] = result.array[i];
                    result.array[i] = temporary;
                }
            }
        }
        return result;
    }
}
