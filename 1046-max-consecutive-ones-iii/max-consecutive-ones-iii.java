class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int left=0;
        int len=0;
        int right=0;
        int n=nums.length;
        int maxlen=0;
        while(right<n){
            if(nums[right]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[left]==0)zeroes--;
                left++;
            }
            if(zeroes<=k){
                len=right-left+1;
                maxlen=Math.max(len, right-left+1);
            }
            
            right++;
        }
        return maxlen;

    }
}