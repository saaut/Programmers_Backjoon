class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String word:dic){
            int count=0;
            for(int i=0;i<spell.length;i++){
                if(word.contains(spell[i])){
                    count++;
                }
            }
            if(count==spell.length)
                return 1;
        }
        return 2;
    }
}