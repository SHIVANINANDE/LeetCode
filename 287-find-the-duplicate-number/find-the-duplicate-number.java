class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<=n; i++){
            int num=Math.abs(nums[i]);
            if(nums[num]>0){
                nums[num] *= -1;
            }else{
                ans= Math.abs(nums[i]);
                break;
            }
        }
        return ans;
    }
}