class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int a : arr) {  //forEach
            sum += a;
        }
        return (double) sum / arr.length;
    }
}

//import java.util.Arrays;
//Stream 이용해서 합계 구하기 : Arrays.stream(arr).sum()
//Stream 이용해서 평균 구하기 : Arrays.stream(arr).average().orElse(0)
