import java.util.*;
class Solution {
    public int solution(int[] sides) {
        sides=Arrays.stream(sides).sorted().toArray();
        if(sides[2]<sides[0]+sides[1])
            return 1;
        else return 2;
    }
}