package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target){

//        length of the given array
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< n; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            else{
                map.put(nums[i], i);
            }

        }

        return nums;
    }

    public static void main(String[] args){
        int[] nums= {1,5,9,3,6};
        int target = 8;

        int[] ans = twoSum(nums, target);
        System.out.print("["+ ans[0]+" "+ ans[1]+"]");
    }
}
