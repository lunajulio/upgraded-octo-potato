package medium;

import java.util.HashSet;

public class Problem12 {
    public int[] intersec(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            if (!contains(nums2, nums1[i])) {
                result[i] = nums1[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!contains(nums1, nums2[i])) {
                result[i] = nums2[i];
            }
        }

        return result;
       
    }

    public boolean contains(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        } else {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            return set.contains(target);
        }
    }
}
