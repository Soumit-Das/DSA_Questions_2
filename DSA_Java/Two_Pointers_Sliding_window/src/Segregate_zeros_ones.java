
/*
Question
Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].

Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)


Approach

We use the two-pointer technique to move 0s to the left and 1s to the right, all in-place without extra space.

Step-by-step explanation:
1. Initialize two pointers:
   - `p1` at the beginning of the array (start)
   - `p2` at the end of the array (end)

2. While p1 is less than or equal to p2:
   - Move `p1` forward until you find a 1 (since 0s are already on the correct side).
   - Move `p2` backward until you find a 0 (since 1s are already on the correct side).
   - If `p1` is still less than `p2`, swap the elements at `p1` and `p2`, and move both pointers inward.

This approach ensures that all 0s are moved to the front and 1s to the back with minimal swaps and optimal performance.
 */

public class Segregate_zeros_ones {

    public int[] segregate0and1(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 <= p2){
            while(p1 <= p2 && arr[p1] == 0){
                p1++;
            }
            while(p2 >= p1 && arr[p2] == 1){
                p2--;
            }
            if(p1 < p2){
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p1++;
                p2--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Segregate_zeros_ones segregateZerosOnes = new Segregate_zeros_ones();
        int[] arr = {0, 0, 1, 1, 0};
        int[] res = segregateZerosOnes.segregate0and1(arr);

        for(int n : res){
            System.out.print(n+" ");
        }
    }
}
