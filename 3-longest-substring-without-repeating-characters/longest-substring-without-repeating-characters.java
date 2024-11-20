class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] hash = new int[128];
        Arrays.fill(hash, -1);
        int left = 0;
        int right=0;
        while(right<n){
            if(hash[s.charAt(right)]!=-1){
                if(hash[s.charAt(right)]>=left){
                    left=hash[s.charAt(right)]+1;
                }
            }
            maxLength=Math.max(maxLength,(right-left+1));
            hash[s.charAt(right)]=right;
            right++;
        }
        
        return maxLength;
    }    
    
}