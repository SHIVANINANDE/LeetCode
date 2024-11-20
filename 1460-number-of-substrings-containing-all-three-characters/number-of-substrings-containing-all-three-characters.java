class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash=new int[3];
        Arrays.fill(hash, -1);
        int n=s.length();
        int cnt=0;
        for(int i=0; i<n; i++){
            hash[s.charAt(i)-'a']=i;
            if((hash[0]!=-1)&&(hash[1]!=-1)&&(hash[2]!=-1)){
                int min=Math.min(hash[1], hash[0]);
                cnt+=1+Math.min(min,hash[2]);
            }
        }
        return cnt;
    }
}