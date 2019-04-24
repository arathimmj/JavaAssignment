import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PatternPrinting {
    public static void main(String[] args) throws Exception{

        int i, j, lim;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your limit");
        lim = Integer.parseInt(br.readLine());

        for(i=0; i<=lim; i++){
            for (j=0;j<i;j++){
                System.out.print(i+"\t");
            }
        }
    }
}
