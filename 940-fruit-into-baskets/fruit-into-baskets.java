class Solution {
    public int totalFruit(int[] fruits) {
        java.util.Map<Integer, Integer> mpp = new java.util.HashMap<>();
        int left = 0;
        int right = 0;
        int maxFruits = 0;
        
        while (right < fruits.length) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);
            
            while (mpp.size() > 2) {
                mpp.put(fruits[left], mpp.get(fruits[left]) - 1);
                if (mpp.get(fruits[left]) == 0) {
                    mpp.remove(fruits[left]);
                }
                left++;
            }
            
            maxFruits = Math.max(maxFruits, right - left + 1);
            right++;
        }
        
        return maxFruits;
    }
}