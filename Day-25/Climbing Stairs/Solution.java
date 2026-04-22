class Solution {
    public int climbStairs(int n) {
        // If there's only 1 or 2 stairs, the answer is just n
        if (n <= 2) return n;

        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            // Shift our focus forward
            first = second;
            second = current;
        }
        
        return second;
    }
}