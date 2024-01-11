import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer="";
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Character> morseToChar=new HashMap<>();
        for(int i=0;i<morse.length;i++){
            morseToChar.put(morse[i],(char)(i+'a'));
        }
        for(String s:letter.split(" ")){
            answer+=morseToChar.get(s);
        }
        return answer;
    }
}