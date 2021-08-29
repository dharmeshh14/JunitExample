package MockitoBasicExample;

public class MaximumNumber {
    public int getMaximumNumber(int[] arr){
        int temp=arr[0];
        int len= arr.length;
        for (int i=1;i<len-2;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }


}
