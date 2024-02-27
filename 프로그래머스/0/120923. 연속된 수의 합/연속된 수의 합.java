import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int i=Math.abs(total)+num;
        while(true){
            for(int j=0;j<num;j++){
                answer[j]=i-j;
            }
            if(Arrays.stream(answer).sum()==total){
                Arrays.sort(answer);
                return answer;
            }
            i--;
        }     
    }
}