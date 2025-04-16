package medium;

public class Problem17 {
    public boolean jumpGame (int[] nums) {

        boolean result = false;
        
        if (nums.length == 1) {
            return true;
        }
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (i > maxReach) {
                return false;
            }
            
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length -1){
                result = true;
                break;
            }
        }
        return result;
    }
}
