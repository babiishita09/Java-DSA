package Arrays;

/*
    Remove Element (Leetcode 27)
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).-----------------------------
 */


import java.util.Arrays;

public class RemoveElement {

    static int removeElement(int[] nums, int val) {
//        length of the given array
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    //    Main method---------------------------
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 2, 4, 8};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

}
