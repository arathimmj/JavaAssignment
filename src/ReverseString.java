import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws Exception {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your string");
        str = br.readLine();

        reverseString(str);
    }

    static void reverseString(String str){

        String revStr="";
        int len = str.length();
        char[] charArray = str.toCharArray();

        for (int i=len-1;i>=0;i--){
            revStr = revStr + charArray[i];
        }

        System.out.println(revStr);
    }
}
