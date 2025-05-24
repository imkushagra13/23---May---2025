import java.util.HashSet;

public class problem7 {
    static int longest(String s){
        int n=s.length();
        int left=0,right=0,maxLen=Integer.MIN_VALUE;
        HashSet<Character> set=new HashSet<>();
        while(right<n){
            char c=s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxLen=Math.max(right-left+1,maxLen);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="abcdaa";
        System.out.println(longest(s));
    }
}
