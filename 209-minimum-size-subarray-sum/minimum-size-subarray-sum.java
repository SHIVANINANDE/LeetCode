class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         if (nums == null || nums.length == 0)
            return 0;
        int i=0;
        int n=nums.length;
        int j=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                minLen=Math.min(minLen, j-i+1);
                sum-=nums[i];
                i++;
                
            }
            j++;
           
        }
        
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}