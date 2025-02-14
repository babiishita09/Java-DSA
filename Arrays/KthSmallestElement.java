package Arrays;

import java.util.PriorityQueue;

/*
    Find Kth Smallest Element in an Array----------------------------------------------
*/
public class KthSmallestElement {

    static int kthSmallestElement(int[] arr, int k) {
//  Create a Max-heap to store kth smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

//  Iterate through the array
        for (int val : arr) {
//  Add current element to the max-heap
            pq.offer(val);

//  If size of the max heap exceed k, remove the largest element
            if (pq.size() > k) {
                pq.poll();
            }
        }

//  Top of the max-heap is kth smallest element
        return pq.peek();
    }

    public static void main(String args[]) {

        int[] arr = {2, 3, 5, 6, 0, 1, -1};
        int k = 1;
        System.out.println(kthSmallestElement(arr, k));
    }
}
