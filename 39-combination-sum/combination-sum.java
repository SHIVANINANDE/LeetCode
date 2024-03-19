class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, ans, temp, 0);
        return ans;
    }
    public void solve(int[] ar, int target, List<List<Integer>> ans, List<Integer> temp, int start){
        if(target<0)return;
        else if(target==0)ans.add(new ArrayList<>(temp));
        else{
            for(int i=start; i<ar.length; i++){
                temp.add(ar[i]);
                solve(ar, target-ar[i], ans, temp, i);
                temp.remove(temp.size()-1);
            }
        }
    }
}