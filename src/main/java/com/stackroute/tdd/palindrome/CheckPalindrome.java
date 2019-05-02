package com.stackroute.tdd.palindrome;

public class CheckPalindrome {

//    check if the number is palindrome and checks if the sum of the even digits is greater than 25
    public int  palindromeCheck(int num) {

        int temp, newnum = 0, op;

        //reverse the number
        temp = num;
        while(num/10!= 0) {
            op = num%10;
            newnum = (newnum * 10) + op;
            num=num/10;
        }
        op = num%10;
        newnum = (newnum * 10) + op;

        EvenDigitSum evenDigitSum = new EvenDigitSum();
        if (temp == newnum) {
            if (evenDigitSum.findEvenNoSum(temp) > 25)      //palindrome and sum of even digits is greater than 25
                return 0;
            else
                return 1;       //palindrome and sum of even digits is less than 25
        }
        else
            return 2;       //not palindrome
    }
}
