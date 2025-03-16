package Array;

public class MaxSubArraySum {

    private static int maxSubArraySum(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) start = i;

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("]");
        return maxi;

    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println("The maximum subarray sum is: " + maxSubArraySum(nums));
    }
}
