import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        Arrays.sort(numbers);
        if(numbers[0]*numbers[1]>numbers[numbers.length-1]*numbers[numbers.length-2])
            return  numbers[0]*numbers[1];
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}