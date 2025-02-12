package Arrays;

/*      Maximum Average Subarray I        */
public class MaximumAvgSubArray {

    static double findMaxAverage(int[] nums, int k) {

//        sum of the first 'k' elements
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

//        Initialize the max sum as the sum of the first 'k' elements
        int maxSum = currentSum;

//        Iterate through the array starting from the k-th element
        for (int i = k; i < nums.length; i++) {
//            Update the current window sum by adding the new element
//            and subtracting the first element of the previous window
            currentSum += nums[i] - nums[i - k];

//            Update the maxSum if current window sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum * 1.0 / k;
    }


    public static void main(String args[]) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));

    }

}
