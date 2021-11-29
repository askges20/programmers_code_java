import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); // HashSet 이용해서 중복값 제거
      
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]); // add로 HashSet에 값 추가
            }
        }
      
        Iterator<Integer> iter = set.iterator();  // Iterator 이용해서 HashSet 값 가져오기
        while(iter.hasNext()) {
            answer.add(iter.next());  // ArrayList에 값 옮기기
        }
        Collections.sort(answer); // Collections의 sort 이용해서 정렬하기
        return answer;
    }
}
