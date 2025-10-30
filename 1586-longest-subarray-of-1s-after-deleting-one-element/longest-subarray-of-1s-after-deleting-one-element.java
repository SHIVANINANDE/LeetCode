class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int longestWindow = 0;

        while (right < nums.length) {
            // Expand the window by including nums[right]
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink the window until zeroCount <= 1
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the longest window size (excluding one deleted element)
            longestWindow = Math.max(longestWindow, right - left);

            // Move right pointer forward
            right++;
        }

        return longestWindow;
    }
}
