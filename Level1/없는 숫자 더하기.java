import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int n: numbers) {
            answer -= n;
        }
        return answer;
    }
}

// for each 돌리기 또는

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}

// java.util.Arrays를 import해서 Arrays.stream(배열 이름).sum();으로 배열 합 구하기 가능
// 단, 시간은 더 오래 걸림
