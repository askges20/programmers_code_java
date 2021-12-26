import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                cnt[0]++;
            }
            if (answers[i] == two[i % two.length]) {
                cnt[1]++;
            }
            if (answers[i] == three[i % three.length]) {
                cnt[2]++;
            }
        }
      
        int max = Arrays.stream(cnt).max().getAsInt();
        ArrayList<Integer> winner = new ArrayList<>();  //ArrayList에 가장 많이 맞춘 사람 저장
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                winner.add(i + 1);
            }
        }
        int[] best = new int[winner.size()];
        for (int i = 0; i < best.length; i++) { //배열에 옮기기
            best[i] = winner.get(i);
        }
        return best;
    }
}
