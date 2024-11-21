class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int maxf=0;
        int len=0;
        int[] hash=new int[26];
        while(right<n){
            hash[s.charAt(right)-'A']++;
            maxf=Math.max(maxf, hash[s.charAt(right)-'A']);
            int changes=(right-left+1)-maxf;
            if(changes>k){
                hash[s.charAt(left)-'A']--;
                maxf=0;
                left++;
            }
            if(changes<=k){
                len=Math.max(len, right-left+1);
            }
            right++;
        }
        return len;
    }
}