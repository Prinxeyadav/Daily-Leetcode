class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int actualSum =  (range * (range + 1))/2; //n*(n+1)/2

        //actual sum when the missiong number is present in array

        int currentSum = 0 ;

        for(int i=0; i<nums.length; i++) {
            currentSum = currentSum + nums[i];

        }

        int ans = actualSum - currentSum;

        return ans;
        
    }
}

