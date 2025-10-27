class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        if (k > n) return 0;

        int cnt = 0, max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) cnt++;
        }
        max = cnt;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) cnt++;
            if (isVowel(s.charAt(i - k))) cnt--;
            max = Math.max(max, cnt);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
