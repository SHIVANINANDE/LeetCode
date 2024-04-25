class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int n=nums.length;
        k=k%n;
        int j=n-k-1;
        for(int i=0;i<=j;i++){
            q1.add(nums[i]);
        }
        for(int i=j+1;i<n;i++){
            q2.add(nums[i]);
        }
        int i=0;
            while(!q2.isEmpty()){
                nums[i++]=q2.remove();
            }
             while(!q1.isEmpty()){
                nums[i++]=q1.remove();
            }
        
    }
}