class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char ch=Character.toLowerCase(s.charAt(i));
                sb.append(ch);
            }
        }
        if((sb.toString()).equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}