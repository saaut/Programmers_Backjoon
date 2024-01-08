class Solution {
    public String solution(String polynomial) {
        int numX = 0;
        int num = 0;

        String[] strArray = polynomial.split(" ");

        for (String s : strArray) {
            if (s.contains("x")) {
                if (s.equals("x"))
                    numX += 1;
                else{
                    
                    numX += Integer.valueOf(s.substring(0, s.indexOf("x")));
                }
            } else if (s.equals("+")) {
                continue;
            } else {
                num += Integer.valueOf(s);
            }
        }

        if (numX == 0)
            return String.valueOf(num);
        if (num == 0)
            return (numX == 1) ? "x" : numX + "x";
        return (numX == 1) ? "x + " + num : numX + "x + " + num;
    }
}