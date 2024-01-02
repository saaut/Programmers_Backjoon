import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set=new HashSet<>();
        int count=0;
        for(String s: s1){
            set.add(s);
        }
        for(String s: s2){
            if(set.contains(s))
                count++;
        }
        return count;
    }
}