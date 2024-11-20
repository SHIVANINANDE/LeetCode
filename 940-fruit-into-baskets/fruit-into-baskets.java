class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mpp=new HashMap<>();
        int left=0;
        int right=0;
        int n=fruits.length;
        int len=0;
        while(right<n){
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);
            if(mpp.size()>2){
                mpp.put(fruits[left], mpp.getOrDefault(fruits[left],0)-1);
                if(mpp.get(fruits[left])==0){
                    mpp.remove(fruits[left]);
                }
                left++;
            }
            if(mpp.size()<=2){
                len=Math.max(len,right-left+1);
            }
            right++;
        }
        return len;
    }
}