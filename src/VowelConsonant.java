import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelConsonant {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String str = br.readLine();

        checkVowelConsonant(str);
    }
    static void checkVowelConsonant(String str){
        int length = str.length();

        for (int i=0;i<length;i++){
            if (Character.isLetter(str.charAt(i))){
                continue;
            }
            else{
                System.out.println("This string contains characters which are not letters");
                return;
            }
        }

        for(int i=0;i<length;i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.print("Vowel\t");
            }
            else {
                System.out.print("Consonant\t");

            }
        }
    }
}
