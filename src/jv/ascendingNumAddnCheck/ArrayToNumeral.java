package jv.ascendingNumAddnCheck;

public class ArrayToNumeral {
    public Result convertArrayToNumeral(Result result){
        int i;
        int length = result.array.length;

        for (i=0;i<length;i++){
            result.finalNumber = (result.finalNumber * 10) + result.array[i];
        }

        return result;
    }
}
