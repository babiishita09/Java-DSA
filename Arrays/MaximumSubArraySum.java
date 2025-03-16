package Array;

/*
     Given an integer array nums, find the subarray with the largest sum, and return its sum. -------------------------------
     Kadane's Algorithm --------------------------------------------
 */
public class MaximumSubArraySum {

    private static int maximumSubArraySum(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        System.out.println(maximumSubArraySum(nums));
    }

}
