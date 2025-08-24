class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=i;
        for(i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        
        
    }
}