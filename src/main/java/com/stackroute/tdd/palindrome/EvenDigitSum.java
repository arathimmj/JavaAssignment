package com.stackroute.tdd.palindrome;

import com.stackroute.tdd.palindrome.CheckEven;

public class EvenDigitSum {

    //find the sum of weven digits
    public int findEvenNoSum(int num){
        CheckEven checkEven = new CheckEven();
        int temp = num, op,sum = 0;
        while(num/10!=0) {
            op = num%10;
            if(checkEven.checkIfEven(op)){
                sum=sum+op;
            }
            num=num/10;
        }
        return sum;
    }
}
