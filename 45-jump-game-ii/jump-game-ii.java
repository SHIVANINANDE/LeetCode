class Solution {
    public int jump(int[] nums) {
        int start=0;
        int end=0;
        int jump=0;
        
        while(end<nums.length-1)
        {
            int far=0;
            for(int i=start; i<=end; i++){
                far=Math.max(far, i+nums[i]);
            }
            start=end+1;
            end=far;
            jump++;

        }
        return jump;
        
    }
}