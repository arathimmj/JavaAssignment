package jv.ascendingNumAddnCheck;

public class ArraySort {
    public Result sortArray(Result result){
        int length,i,j,temporary;
        length = result.array.length;
        for (i=0;i<length;i++){
            for (j=i+1;j<length;j++){
                if (result.array[j]>result.array[i]){
                    temporary=result.array[j];
                    result.array[j] = result.array[i];
                    result.array[i] = temporary;
                }
            }
        }
        return result;
    }
}
