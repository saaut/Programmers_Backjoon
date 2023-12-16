import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> my_list=new ArrayList<>();
        List<Integer> result=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0) my_list.add(i);
        }
        for(Integer number:my_list){
            if(is_prime(number))
                result.add(number);
        }
        return result.stream().mapToInt(Integer::intValue)
                .toArray();
    }
    static public boolean is_prime(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}