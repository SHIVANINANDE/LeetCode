class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
        
        //sorting the initial array so that  brute forcing becomes easy
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; ++i) {
            
            // Never let i refer to the same value twice to avoid duplicates.
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));  //push the arrays in result..
                    ++j;
                    // Never let j refer to the same value twice (in an output) to avoid duplicates..
                    while (j < k && nums[j] == nums[j-1])
                        ++j;
                }
                
                //since array is sorted and sum is less than 0 then it means that the valid sum could be present later in the array so we increase the forward  pointer...
                else if (nums[i] + nums[j] + nums[k] < 0) {
                    ++j;
                }
                
                //since array is sorted and sum is greater than 0 then it means that the valid sum could be present earlier in the array so we decrease the backward pointer...
                else {
                    --k;
                }
            }
        }
        return res;    //retuirn the result.. 
    }
}