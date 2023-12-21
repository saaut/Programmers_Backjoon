import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> myList=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(i*i==n) myList.add(i);
            else if(n%i==0){
                myList.add(i);
                myList.add(n/i);
            }
        }
        return myList.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}