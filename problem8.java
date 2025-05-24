import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class problem8 {
    static List<List<String>> anagram(String[] str){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sorted=new String(charArr);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }

            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=anagram(str);

        for(List<String> s:result) System.out.println(s);
    }
}
