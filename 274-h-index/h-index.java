class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);              // ascending
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {        // scan from left or right; left is fine
            int atLeast = n - i;             // papers with >= citations[i]
            if (citations[i] >= atLeast) {
                h = atLeast;                 // this is the max possible from here
                break;                       // earlier i can't give larger h
            }
        }
        return h;
    }
}