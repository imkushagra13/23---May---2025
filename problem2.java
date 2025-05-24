import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        int[] arr={1,4,2,1,5};
        int k=6;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
