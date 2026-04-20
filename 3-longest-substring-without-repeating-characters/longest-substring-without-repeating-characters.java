class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp=new HashMap<>();
        int left=0;
        int right=0;
        int len=0;
        int n=s.length();
        while(right<n){
            char ch=s.charAt(right);
            if(mpp.containsKey(ch)){
                if(mpp.get(ch)>=left){
                    left=mpp.get(ch)+1;
                    if(mpp.get(ch)==0)mpp.remove(ch);
                }
            }
            len=Math.max(len, right-left+1);
            mpp.put(ch,right);
            right++;
        }
        return len;
        
    }
}