class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mpp=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }
        for(int nums:mpp.values()){
            if(set.contains(nums)){
                return false;
            }
            set.add(nums);
        }
        return true;

        
    }
}