class Solution {
    public int solve(int idx, int buy, int n, int[][] dp, int[] ar){
        if(idx==n)return 0;
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        int profit=0;
        if(buy==0){
            profit=Math.max((solve(idx+1, 0,n,dp,ar)),(-ar[idx]+solve(idx+1, 1,n,dp,ar)));
        }
        if(buy==1){
            profit=Math.max((solve(idx+1, 1,n,dp,ar)),(ar[idx]+solve(idx+1, 0,n,dp,ar)));
        }
        return dp[idx][buy]=profit;
    }
    public int maxProfit(int[] prices) {
       int n = prices.length; 
       int[][] dp=new int[n+1][2];
       for(int[] row:dp){
        Arrays.fill(row,-1);
       }
       int ans = solve(0,0,n,dp,prices);
       return ans;
    }
}