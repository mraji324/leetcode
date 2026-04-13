public class leetcode306 {
    class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        // Try all possible first and second numbers
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                
                String first = num.substring(0, i);
                String second = num.substring(i, i + j);
                
                // Skip numbers with leading zeros
                if ((first.length() > 1 && first.charAt(0) == '0') ||
                    (second.length() > 1 && second.charAt(0) == '0')) {
                    continue;
                }
                
                if (check(num, i + j, first, second)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean check(String num, int start, String first, String second) {
        if (start == num.length()) return true;
        
        // Use BigInteger to avoid overflow
        java.math.BigInteger num1 = new java.math.BigInteger(first);
        java.math.BigInteger num2 = new java.math.BigInteger(second);
        java.math.BigInteger sum = num1.add(num2);
        
        String sumStr = sum.toString();
        
        // Check if sum matches next part of string
        if (!num.startsWith(sumStr, start)) {
            return false;
        }
        
        // Continue checking
        return check(num, start + sumStr.length(), second, sumStr);
    }
}
}
