class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0; int j=0;
        int n1=word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();
        if(word1.length()==0)return "";
        if(word2.length()==0)return "";
        while(i<n1 && j<n2){
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }
        while(i<n1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<n2){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();

    }

}