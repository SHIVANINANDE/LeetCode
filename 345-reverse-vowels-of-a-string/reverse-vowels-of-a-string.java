class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            while (i < j && !isVowel(a[i])) i++;
            while (i < j && !isVowel(a[j])) j--;

            if (i < j) {
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++; 
                j--;
            }
        }
        return new String(a);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
