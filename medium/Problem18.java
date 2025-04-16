package medium;

public class Problem18 {
    public int jumpGame2 (int[] nums) {
        // This function returns the minimum number of jumps to reach the end of the array.
        // If it is not possible to reach the end, it returns 0.

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length -1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }

            if (currentEnd >= nums.length - 1) {
                break;
            }
        }

        return jumps;
    }
}
