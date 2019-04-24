import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessTheNumber {
    public static void main(String[] args) throws Exception {

        int num, guess;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number between 1 and 50");
        num = Integer.parseInt(br.readLine());

        System.out.println("Guess the number");
        guess=Integer.parseInt(br.readLine());

        checkMatch(guess, num);
    }
    static  void checkMatch(int guess, int num) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (guess != num){
            if (guess>num)
                System.out.println("The number guessed is more than the original number");
            else if (guess<num)
                System.out.println("The number guessed is less than the original number");
            guess=Integer.parseInt(br.readLine());
            checkMatch(guess, num);
        }
        else
            System.out.println("The number guessed matches the original number");
    }
}
