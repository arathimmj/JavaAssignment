package jv.palindrome;

public class EvenDigitSum {
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
