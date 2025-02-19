package easy;

import java.util.Arrays;


public class Problem1 {
    public void merge_sorted_array(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}
