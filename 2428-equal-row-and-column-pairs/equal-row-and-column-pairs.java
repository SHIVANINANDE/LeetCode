import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowCount = new HashMap<>();
        
        // Serialize rows and count
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(','); // comma as delimiter
            }
            rowCount.put(sb.toString(), rowCount.getOrDefault(sb.toString(), 0) + 1);
        }
        
        // Build each column string and sum matches
        int result = 0;
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(',');
            }
            result += rowCount.getOrDefault(sb.toString(), 0);
        }
        
        return result;
    }
}
