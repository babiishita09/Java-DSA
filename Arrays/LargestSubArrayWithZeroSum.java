package Array;

import java.util.Arrays;
import java.util.HashMap;

public class LargestSubArrayWithZeroSum {

    private static int largestSubArrayWithZeroSum(int[] nums, int k) {
        k = nums.length;
        int max_len = 0;
        int sum = 0;

        HashMap<Integer, Integer> preSum = new HashMap<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            if (sum == 0) {
                max_len = i + 1;
            } else if (preSum.containsKey(sum)) {
                max_len = Math.max(max_len, i - preSum.get(sum));
            } else {
                preSum.put(sum, i);
            }
        }
        return max_len;
    }


    public static void main(String[] args) {
        int[] nums = {9, -3, 3, -1, 6, -5};
//                      9, 6, 9,8,14,9
        int k = nums.length;
        System.out.println(largestSubArrayWithZeroSum(nums, k));
    }
}
