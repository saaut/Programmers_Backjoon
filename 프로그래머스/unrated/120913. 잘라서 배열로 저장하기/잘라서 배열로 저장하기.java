import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer=new ArrayList<>();
        for(int i=0;i<my_str.length();i+=n){
            if(n+i>my_str.length())
                answer.add(my_str.substring(i,my_str.length()));
            else
                answer.add(my_str.substring(i,n+i));
        }
        return answer.stream().toArray(String[]::new);
    }
}