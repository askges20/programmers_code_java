import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        for (int n : d) {
            if (budget >= n) {
                cnt++;
                budget -= n;
            } else {
                break;
            }
        }
        return cnt;
    }
}
