import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterCheck {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your character");
        char ch = br.readLine().charAt(0);

        checkCharacter(ch);

    }
    static void checkCharacter(char ch) {
        if (Character.isLowerCase(ch)){
            System.out.println("Lower case letter");
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("Upper case letter");
        }
        else if (Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special characters");
        }
    }
}
