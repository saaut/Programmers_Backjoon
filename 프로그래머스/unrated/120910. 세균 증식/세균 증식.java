import java.math.*;
class Solution {
    public int solution(int n, int t) {
        for(int i=0;i<t;i++){
            n=doubleCalc(n);
        }
        return n;
    }
    public int doubleCalc(int n){
        return 2*n;
    }
}