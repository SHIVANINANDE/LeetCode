class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int left=0, right=0;
        int count=0;
        long product=1;
        int n=nums.length;
        while(right<n){
            product *= nums[right];
            while(product>=k && left<=right){
                product /= nums[left];
                left++;
            }
            
            count += (right-left+1);
            right++;
        }
        return count;
    }
}