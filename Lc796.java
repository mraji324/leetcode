public class Lc796 {
    class Solution {
    public boolean rotateString(String s, String goal) {
        // Length must be same
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Check if goal is substring of s + s
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
}
