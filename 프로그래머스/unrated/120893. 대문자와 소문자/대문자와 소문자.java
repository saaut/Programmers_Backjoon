class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char c: my_string.toCharArray()){
            if((int)c<97)
                c+=32;
            else
                c-=32;
            answer+=c;
        }
        return answer;
    }
}