class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for (int n : arr) {
            length += n;
        }
        
        int[] answer = new int[length];
        int idx = 0;
        
        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                answer[idx++] = n;
            }
        }
        
        return answer;
    }
}