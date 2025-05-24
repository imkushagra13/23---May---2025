import java.util.Arrays;

public class problem3 {
    static void reverse(int[] arr,int i,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void nextPer(int[] arr){
        int i=arr.length-1;
        while(i>0&&arr[i-1]>=arr[i]){
            i--;
        }
        if(i==0) {
            reverse(arr, 0, arr.length - 1);
            return ;
        }
        int j=arr.length-1;
        while(j>=i&&arr[j]<=arr[i-1]){
            j--;
        }
        swap(arr,i-1,j);
        reverse(arr,i,arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr={6,5,7,8};
        nextPer(arr);
        System.out.println(Arrays.toString(arr));
    }
}
