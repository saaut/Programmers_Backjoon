import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character,Integer> map=new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (entry.getValue() >= 2) {
                iterator.remove();
            }
        }
        Map<Character, Integer> sortedMap = new TreeMap<>(map);
        for(char c:sortedMap.keySet()){
            answer+=c;
        }        return answer;
    }
}