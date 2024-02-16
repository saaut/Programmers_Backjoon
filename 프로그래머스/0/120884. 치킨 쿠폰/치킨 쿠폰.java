class Solution {
    public int solution(int chicken) {
        int servedChickens = chicken / 10;
        int remainingCoupons = chicken % 10 + servedChickens;

        while (remainingCoupons >= 10) {
            int bonusChickens = remainingCoupons / 10;
            servedChickens += bonusChickens;
            remainingCoupons = remainingCoupons % 10 + bonusChickens;
        }

        return servedChickens;
    }
}