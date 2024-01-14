import java.util.*;
class Solution {
    public String solution(int age) {
        String answer="";
        Map<Character,Character> number=new HashMap<>();
        for(int i=0;i<10;i++){
            number.put((char)(i+'0'),(char)(i +'a'));
        }
        String stringAge=Integer.toString(age);
        for(Character num:stringAge.toCharArray()){
            answer+=number.get(num);
        }
        return answer;
    }
}