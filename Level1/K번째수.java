import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int cnt = 0;
        int[] answer = new int[commands.length];
        for (int[] c : commands) {
            int[] arr = new int[c[1] - c[0] + 1];
            int idx = 0;
            for (int i = c[0] - 1; i < c[1]; i++) {
                arr[idx++] = array[i];
            }
            Arrays.sort(arr);
            answer[cnt++] = arr[c[2] - 1];
        }
        return answer;
    }
}
