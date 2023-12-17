import java.util.*;
class Solution {
    public int solution(String s) {
        List<Integer> my_list=new ArrayList<>();
        String minus = "";
        for(String c:s.split(" ")){
            if(c.equals("Z")){
                my_list.add((-1)*Integer.parseInt(minus));
            }else{
            my_list.add(Integer.parseInt(c));
            minus=c;}
        }
        return my_list.stream().mapToInt(i->i).sum();
    }
}