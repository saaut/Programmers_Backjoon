import java.util.*;
class Solution {
    public String solution(String my_string) {      
        String answer="";
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:my_string.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==1)
                answer+=c;
        }
        return answer;
    }
}