class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // if concatenations differ, no common divisor string exists
        if (!(str1 + str2).equals(str2 + str1)) return "";
        
        int len1 = str1.length();
        int len2 = str2.length();
        int g = gcd(len1, len2);
        return str1.substring(0, g);
    }
    
    // Euclidean algorithm for gcd of lengths
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
