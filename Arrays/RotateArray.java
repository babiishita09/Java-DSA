package Arrays;

/*
Rotates the given array to the right by k steps------------------------------------
 */
public class RotateArray {
    //    class-level variable to store the input array
    private int[] nums;

    //    Rotate the given array to the right by k steps
    public void Rotate(int[] nums, int k) {
    //    Assign the input array to the class level variable
        this.nums = nums;
    //    length of the array
        int n = nums.length;

    //    if k is greater than the size of array
        k %= n;

    //    Reverse the entire array
        reverse(0, n - 1);
    //    Reverse the first part (upto k)
        reverse(0, k - 1);
    //    Reverse the second part (from k to end of the array
        reverse(k, n - 1);

    }

    private void reverse(int i, int j) {

        while (i < j) {
            int temp = nums[i];

    //    Perform swap
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        RotateArray rotate = new RotateArray();
        rotate.Rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
