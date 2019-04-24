import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TomJerry {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int num = Integer.parseInt(br.readLine());

        checkEvenOdd(num);

    }
    static void checkEvenOdd(int num){
        if (num>20 && num<30) {
            if (num%2==0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
    }
}
