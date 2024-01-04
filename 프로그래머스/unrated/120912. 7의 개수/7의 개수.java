import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        List<String>strArray=new ArrayList<>();
        for(int num:array){
            strArray.add(String.valueOf(num));
        }
        for(String num:strArray){
            for(char c:num.toCharArray()){
                if(c=='7') answer++;
            }
        }
        return answer;
    }
}