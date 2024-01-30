import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> playerCount =new HashMap<>();
        
        for(String player:participant){
            playerCount.put(player, playerCount.getOrDefault(player,0)+1);
        }
        for(String player: completion){
            int count=playerCount.getOrDefault(player,0)-1;
            if(count==0) playerCount.remove(player);
            else playerCount.put(player,count);
        }
        Set<String> keySet = playerCount.keySet();
        String answer="";
        for (String key : keySet) {
            answer= key;
        }    
        return answer;
    }
}