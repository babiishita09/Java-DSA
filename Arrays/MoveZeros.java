package Arrays;

/*    Move All Zeroes to the end of the array                            */
public class MoveZeros {

    static void pushZeroesToEnd(int[] arr) {

//   Pointer to track the position next non-zero element
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

//   if current element is non-zero
            if (arr[i] != 0) {

//   swap the current element with the 0 at index count

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

//              Move current pointer to the next position
                count++;
            }
        }

    }


    public static void main(String args[]) {

        int[] arr = {1, 0, 0, 3, 0, 2, 0, 0, 0, 5};
        pushZeroesToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
