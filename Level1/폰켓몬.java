import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return hs.size() > nums.length / 2 ? nums.length / 2 : hs.size();
    }
}

// 파이썬의 set 대신 자바에서는 HashSet 이용
