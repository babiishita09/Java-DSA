package Arrays;

/*
  Find K-th Largest element in an array------------------------------------
 */

import java.util.PriorityQueue;

public class KthLargestElement {

    static int kthLargest(int[] arr, int k) {
// Min heap to store kth largest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();

// Iterate through the array elements
        for (int val : arr) {
//  Add current element to min heap
            pq.add(val);

//  If heap exceed current element, remove smallest element
            if (pq.size() > k)
                pq.poll();
        }
//  Top of the heap is the kth largest element
        return pq.peek();
    }


    public static void main(String args[]) {

        int[] arr = {2, 56, 7, 8, 2, 3, 4};
        int k = 1;

        System.out.println(kthLargest(arr, k));
    }

}
