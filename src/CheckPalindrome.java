import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckPalindrome {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int num = Integer.parseInt(br.readLine());

        palindromeCheck(num);
    }

    static void palindromeCheck(int num) {

        int sum = 0, temp, temp1, newnum = 0, op, op1;

        temp = num;
        while(num/10!= 0) {
            op = num%10;
            newnum = (newnum * 10) + op;
            num=num/10;
        }
        op = num%10;
        newnum = (newnum * 10) + op;
        temp1 = temp;
        if (temp == newnum){
            while(temp/10!=0) {
                op1 = temp%10;
                if(op1%2==0){
                    sum=sum+op1;
                }
                temp=temp/10;
            }
            if (sum > 25){
                System.out.println(temp1 + " is a palindrome and sum of even numbers is greater than 25");
            }
            else {
                System.out.println(temp1 + " is palindrome and sum of even numbers is less than 25");
            }

        }
        else {
            System.out.println(temp + " is not palindrome");
        }
    }
}
