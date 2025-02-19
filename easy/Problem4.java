package easy;

public class Problem4 {
        // si el array está ordenado
        public int removeDuplicates2(int[] nums) {
            int k = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[k]) {
                    k++;
                    nums[k] = nums[i];
                }
            }
            return k + 1;
        }
}
