package Arrays;

/*
   Product of Array Except Self (Leetcode 238)
 */
public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {
//     Length of the input array
        int n = nums.length;

//     Initialize the answer array with the same length
        int[] result = new int[n];
//     Initialize 'leftProduct' to 1, to represent the product of elements to the left of the current index
        int leftProduct = 1;
//     Initialize 'rightProduct' to 1, to represent the product of elements to the right of the current index
        int rightProduct = 1;

        for (int i = 0; i < n; i++) {
//     Set the current element in the result array to 'leftProduct'
            result[i] = leftProduct;
//     Multiply 'leftProduct' by the current element in nums for the next iteration (prefix product)
            leftProduct *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
//     Multiply the current element in the result array by 'rightProduct'
            result[i] *= rightProduct;

//     Multiply 'rightProduct' by the current element in nums for the next iteration (suffix product)
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 7, 0};
        int[] res = productExceptSelf(nums);

        for (int num : res) {
            System.out.print(" " + num);
        }
    }

}
