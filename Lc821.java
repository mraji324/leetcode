public class Lc821 {
  class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        
        int prev = -n; // Initialize far left
        
        // Left to Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }
        
        prev = 2 * n; // Initialize far right
        
        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        
        return result;
    }
}  
}
