public class problem9 {
    public static void main(String[] args) {
        int[] nums={5,0,2,2,1};
        int[] count=new int[10];
        for(int i:nums){
            count[i]++;
        }

        int idx=0;
        for(int i=0;i<10;i++){
            while(count[i]-->0){
                nums[idx++]=i;
            }
        }

        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();

    }
}
