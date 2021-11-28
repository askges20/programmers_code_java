class Solution {
    public int solution(String s) {
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alpha[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

// Integer.toString : int -> str 변환
// Integer.parseInt : str -> int 변환
// replaceAll 이용해서 문자열 바꾸기
