class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {

            long MOD = 1_000_000_007L;
            int n = nums.length;


            for(int [] query : queries) {
                
                int l = query[0];
                int r = query[1];
                int k = query[2];
                int v = query[3];


                for (int i = l; i<=r; i+= k) {
                    long updateValue = (1L *  nums[i] * v) % MOD;
                    nums[i] = (int) updateValue;
                }
            }

            int xorResult = 0 ;
            for (int num : nums) {
                xorResult ^= num;
            }

            return xorResult ;
        }
    }