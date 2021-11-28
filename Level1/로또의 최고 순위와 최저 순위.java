class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;

        for (int l : lottos) {
          if (l == 0) {
            zeroCnt++;
            continue;
          }
          for (int w : win_nums) {
            if (w == l) {
              matchCnt++;
              break;
            }
          }
        }

        int[] answer = {Math.min(6, 7 - (matchCnt + zeroCnt)), Math.min(6,  7 - matchCnt)};
        return answer;
    }
}
