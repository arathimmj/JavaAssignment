import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringInteger {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string");
        String str = br.readLine();

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        repeatString(str, num);
    }
    static void repeatString(String str, int num){
        int length = str.length();

        String addStr = str.substring(length-num,length);

        for (int i=0;i<num;i++)
            str = str + addStr;

        System.out.println(str);
    }
}
