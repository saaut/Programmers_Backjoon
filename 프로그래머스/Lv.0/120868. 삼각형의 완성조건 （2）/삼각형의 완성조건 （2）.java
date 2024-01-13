import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        //가장 긴 변이 sides에 있는 경우
        // for(int i=1;i+sides[0]>sides[1];i++){
        //     answer++;
        // }
        //가장 긴 변이 나머지 한 변인 경우
        for(int i=1;i<sides[0]+sides[1];i++){
            if(i+sides[0]>sides[1])
                answer++;
            else if(sides[0]+sides[1]>i&&sides[1]<i)
                answer++;
        }
        return answer;
    }
}