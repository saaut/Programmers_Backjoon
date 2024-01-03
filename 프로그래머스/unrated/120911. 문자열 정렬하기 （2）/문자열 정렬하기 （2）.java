import java.util.*;
class Solution {
    public String solution(String my_string) { 
        my_string=my_string.toLowerCase();
        char[] cArray=my_string.toCharArray();
        Arrays.sort(cArray);
        return String.valueOf(cArray);
    }
}