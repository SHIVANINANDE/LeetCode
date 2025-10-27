class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (k > n) return 0.0; // edge case check
        
        double sum = 0.0;
        // calculate initial window sum of size k
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum; // store the max sum so far
        
        // use sliding window to find max sum of any subarray of size k
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k]; // slide window
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum / k; // return the maximum average
    }
}
