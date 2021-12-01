//toCharArray()로 문자열을 배열로
//String.valueOf(배열)로 배열을 문자열로
class Solution {
    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = '*';
        }
        return String.valueOf(arr);
    }
}


//substring()을 이용해서 (속도 느림)
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += '*';
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}
