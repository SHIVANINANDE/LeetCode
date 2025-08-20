class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=prices[0];
        int max_profit=0;
        for(int i=1; i<prices.length; i++){
            min=Math.min(prices[i], min);
            max_profit=Math.max(max_profit, prices[i]-min);
        }
        return max_profit;

    }
}