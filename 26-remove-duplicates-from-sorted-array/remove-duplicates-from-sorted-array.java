class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=i;
        for(i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}