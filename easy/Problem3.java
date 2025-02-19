package easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem3 {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Convertir Set de vuelta a array
        int index = 0;
        for (Integer num : set) {
            nums[index++] = num;
        }

        return set.size();
    }
}
