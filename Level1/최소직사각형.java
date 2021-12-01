import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] w = new int[sizes.length + 1];
        int[] h = new int[sizes.length + 1];
        
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            w[i] = sizes[i][0];
            h[i] = sizes[i][1];
        }
        Arrays.sort(w);
        Arrays.sort(h);
        return w[sizes.length] * h[sizes.length];
    }
}
