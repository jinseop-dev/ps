class Solution {
    public int solution(String[] order) {
        int total = 0;
        
        for (String menu : order) {
            total += menu.contains("cafelatte") ? 5000 : 4500;
        }
        
        return total;
    }
}