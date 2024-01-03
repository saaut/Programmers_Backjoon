import java.util.*;
class Solution {
    public String solution(String my_string) { 
        char[] cArray=my_string.toLowerCase().toCharArray();
        Arrays.sort(cArray);
        return String.valueOf(cArray);
    }
}