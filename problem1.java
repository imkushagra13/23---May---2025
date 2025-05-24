import java.util.Arrays;

public class problem1 {
    static int[] twoSum(int []arr, int tar){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==tar){
                return new int[]{i,j};
            }
            else if(sum>tar) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={-2,-1,-1,-1,-1,-1};
        int tar=-3;
        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }
}
