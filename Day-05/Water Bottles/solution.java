class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles>=numExchange){

            int newBottles = numBottles/numExchange;

            int renBottles =numBottles % numExchange ;

            ans += newBottles;

            numBottles = newBottles + renBottles;
        }

        return ans;
        
    }
}