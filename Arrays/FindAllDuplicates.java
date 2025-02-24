package Arrays;

/*
    Find All Duplicates in an Array (Leetcode 442) ---------------------------------------
 */

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {

//  Length
        int n = nums.length;

//  Initialized a list to hold
        List<Integer> duplicates = new ArrayList<>();

//  Place each number in its correct position suct that a number i is at index i-1
        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

//  Scan the array for duplicates, a duplicates is found if the number is not atv its correct position
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    }

    //  Swap two elements in an array
    static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    //  Main method
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 5, 6, 7, 2, 4, 5};
        System.out.println(findDuplicates(nums));
    }


}
