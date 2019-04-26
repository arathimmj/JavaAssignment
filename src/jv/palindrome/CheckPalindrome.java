package jv.palindrome;

public class CheckPalindrome {

    public int  palindromeCheck(int num) {

        int temp, newnum = 0, op;

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
            if (evenDigitSum.findEvenNoSum(temp) > 25)
                return 0;
            else
                return 1;
        }
        else
            return 2;
    }
}
