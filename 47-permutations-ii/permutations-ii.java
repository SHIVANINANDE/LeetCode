class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        solve(ans, temp, used, nums);
        return ans;
    }
    public void solve(List<List<Integer>> ans, List<Integer> temp, boolean[] used, int[]nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }else{
            for(int i=0; i<nums.length; i++){
                if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1])continue;
                used[i]=true;
                temp.add(nums[i]);
                solve(ans, temp, used, nums);
                used[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}