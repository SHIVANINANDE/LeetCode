
class Solution {
    public class arComparator implements Comparator<int[]>{
        public int compare(int[]a, int[]b){
            int st=Integer.compare(a[0], b[0]);
            if(st==0){
                return 0;
            }
            return st;
        }
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new arComparator());
        int n = intervals.length;
        if (n <= 1) {
            return intervals; // No need to merge if there's only one interval or none
        }
        int[][] merged = new int[n][2];
        int mergedIdx = 0;
        int i = 0;

        while (i < n) {
            if (mergedIdx == 0 || merged[mergedIdx - 1][1] < intervals[i][0]) {
                // Non-overlapping interval or the first interval
                merged[mergedIdx][0] = intervals[i][0];
                merged[mergedIdx][1] = intervals[i][1];
                mergedIdx++;
            } else {
                // Overlapping intervals, update the end time of the merged interval
                merged[mergedIdx - 1][1] = Math.max(merged[mergedIdx - 1][1], intervals[i][1]);
            }
            i++;
        }

        // Return only the merged intervals (trim the extra rows if any)
        return Arrays.copyOf(merged, mergedIdx);
    }
}