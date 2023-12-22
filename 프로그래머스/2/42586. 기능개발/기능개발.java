import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remainder = (100 - progresses[i]) / speeds[i];
            q.add(((100 - progresses[i]) % speeds[i] == 0) ? remainder : remainder + 1);
        }

        List<Integer> answer=new ArrayList<>();
        int day=1;
        while (!q.isEmpty()) {
            int progress = q.poll();
            if (q.peek() != null) {
                if (progress < q.peek()){
                    answer.add(day);
                    day=1;
                }
                else if (progress >= q.peek()) {
                    while (!q.isEmpty() && q.peek() <= progress) {
                        day += 1;
                        q.poll();
                    }
                    answer.add(day);
                    day=1;
                }
            }
            else answer.add(day);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}