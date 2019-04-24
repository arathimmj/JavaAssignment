import java.util.Scanner;

public class IntegerTotal {
    public static void main(String[] args) {

        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number;

        while ((number = input.nextInt()) != 0) {
            total = total + number;
        }
        System.out.println(total);
    }
}
