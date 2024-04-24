class Solution {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> q=new LinkedList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                q.add(nums[i]);
            }
        }
        int i=0;
       while(!q.isEmpty() && i<nums.length){
            nums[i]=q.peek();
            q.remove();
            k++;
            i++;
       }
       return k;
    }
}