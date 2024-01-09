class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] splitedString=my_string.split("[a-zA-Z]");
        
        for(String str:splitedString){
           if(str.startsWith("1")||str.startsWith("2")||str.startsWith("3")||str.startsWith("4")||str.startsWith("5")||str.startsWith("6")||str.startsWith("7")||str.startsWith("8")||str.startsWith("9")){
               answer+=Integer.valueOf(str);  
        } 
        }
        
        return answer;
    }
}