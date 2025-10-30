class Solution {
    public int pivotIndex(int[] nums) {
        
        int n=nums.length;
        for(int i=0; i<n; i++){
            int leftSum=0;
            int rightSum=0;
            int j=i-1;
            while(j>=0){
                leftSum+=nums[j];
                j--;
            }
            j=i+1;
            while(j<n){
                rightSum+=nums[j];
                j++;
            }
            if(leftSum==rightSum){
                return i;
            }

        }
        return -1;
    }
}