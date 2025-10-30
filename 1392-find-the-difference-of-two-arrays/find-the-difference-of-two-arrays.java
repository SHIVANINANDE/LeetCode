import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert both arrays into sets to keep distinct elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        
        // Find elements in set1 but not in set2
        List<Integer> onlyIn1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                onlyIn1.add(num);
            }
        }
        
        // Find elements in set2 but not in set1
        List<Integer> onlyIn2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                onlyIn2.add(num);
            }
        }
        
        // Return result as a list of two lists
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(onlyIn1);
        answer.add(onlyIn2);
        
        return answer;
    }
}
