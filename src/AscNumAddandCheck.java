import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AscNumAddandCheck {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your number");
        int num = Integer.parseInt(br.readLine());

        sortAndSum(num);

    }

    static void sortAndSum(int num) {

        int max=0, i=0, j, temporary, finalNum=0, sum=0;

        int length = String.valueOf(num).length();
        int array[] = new int[length];


        while (num/10 != 0) {
            array[i] = num%10;
            num=num/10;
            i++;
        }
        array[i] = num;

        for (i=0;i<length;i++){
            for (j=i+1;j<length;j++){
                if (array[j]>array[i]){
                    temporary=array[j];
                    array[j] = array[i];
                    array[i] = temporary;
                }
            }
        }
        for (i=0;i<length;i++){
            finalNum = (finalNum * 10) + array[i];
            if (array[i]%2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Sorted number in non-increasing order: "+finalNum);
        System.out.println("Sum: "+sum);
        if (sum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
