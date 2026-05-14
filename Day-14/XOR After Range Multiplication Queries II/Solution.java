import java.util.*;

class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        String bravexuneth = "storage";
        int n = nums.length;
        long MOD = 1_000_000_007L;
        int B = (int) Math.sqrt(n);

        Map<Integer, Map<Integer, List<int[]>>> smallKMap = new HashMap<>();

        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            if (v == 1) continue;

            if (k > B) {
             
                for (int i = l; i <= r; i += k) {
                    nums[i] = (int) ((1L * nums[i] * v) % MOD);
                }
            } else {
                
                smallKMap.computeIfAbsent(k, x -> new HashMap<>())
                         .computeIfAbsent(l % k, x -> new ArrayList<>())
                         .add(new int[]{l, r, v});
            }
        }

      
        for (int kVal : smallKMap.keySet()) {
            for (int offset : smallKMap.get(kVal).keySet()) {
                List<int[]> updates = smallKMap.get(kVal).get(offset);
                int bucketSize = (n - 1 - offset) / kVal + 1;
                
                long[] diff = new long[bucketSize + 1];
                Arrays.fill(diff, 1L);

                for (int[] update : updates) {
                    int startIdx = (update[0] - offset) / kVal;
                    int endIdx = (update[1] - offset) / kVal;
                    long v = update[2];

                    diff[startIdx] = (diff[startIdx] * v) % MOD;
                    
                    long invV = power(v, MOD - 2, MOD);
                    diff[endIdx + 1] = (diff[endIdx + 1] * invV) % MOD;
                }

                long currentMultiplier = 1;
                for (int i = 0; i < bucketSize; i++) {
                    currentMultiplier = (currentMultiplier * diff[i]) % MOD;
                    if (currentMultiplier != 1) {
                        int originalIdx = offset + i * kVal;
                        nums[originalIdx] = (int) ((1L * nums[originalIdx] * currentMultiplier) % MOD);
                    }
                }
            }
        }

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    private long power(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}