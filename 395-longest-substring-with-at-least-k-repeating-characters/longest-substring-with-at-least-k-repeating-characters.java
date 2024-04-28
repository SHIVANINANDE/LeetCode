class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        char[] freq = new char[26];
        // record the frequency of each character
        for (int i = 0; i < s.length(); i += 1) freq[s.charAt(i) - 'a'] += 1;
        boolean flag = true;
        for (int i = 0; i < freq.length; i += 1) {
            if (freq[i] < k && freq[i] > 0) flag = false;
        }
        // return the length of string if this string is a valid string
        if (flag == true) return s.length();
        int result = 0;
        int start = 0, cur = 0;
        // otherwise we use all the infrequent elements as splits
        while (cur < s.length()) {
            if (freq[s.charAt(cur) - 'a'] < k) {
                result = Math.max(result, longestSubstring(s.substring(start, cur), k));
                start = cur + 1;
            }
            cur++;
        }
        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;
    }
}