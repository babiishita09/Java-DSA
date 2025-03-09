package Array;

/*
    Sort an array of 0's  1's  and  2's --------------------------------------------------------------------------
 */

public class SortColors {

    public static void sortColors(int[] nums){
//        length
        int n= nums.length;
        int low= 0;
        int mid =0;
        int high = n-1;

        while(mid <= high){
            if(nums[mid]== 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }

            else{
                swap(nums, mid, high);
                high--;
            }

        }

    }
//    swap method----------------------------------
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {1,0,2,1,0,0,1,1,2,1,2,2};

        sortColors(nums);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
