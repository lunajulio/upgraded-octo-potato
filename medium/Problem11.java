package medium;

import java.util.HashMap;
import java.util.HashSet;

public class Problem11 {
    public static int[] twoSum(int[] numeros, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            int complemento = target - numeros[i];

            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(numeros[i], i);
        }

        return new int[] {};
    }

    public int[] twoSum2(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
