class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Count citations
        for (int citation : citations) {
            if (citation > n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        // Calculate h-index
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }

        return 0; 
    }
}