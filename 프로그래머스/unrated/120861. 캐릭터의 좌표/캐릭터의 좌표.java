class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] coor = {0, 0};

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    coor[1] = Math.min(coor[1] + 1, board[1] / 2);
                    break;
                case "down":
                    coor[1] = Math.max(coor[1] - 1, -board[1] / 2);
                    break;
                case "left":
                    coor[0] = Math.max(coor[0] - 1, -board[0] / 2);
                    break;
                case "right":
                    coor[0] = Math.min(coor[0] + 1, board[0] / 2);
                    break;
            }
        }
        return coor;
    }
}
