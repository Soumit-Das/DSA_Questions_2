
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
   - `p1` at the beginning of the array (start scanning from left)
   - `p2` at the end of the array (start scanning from right)

2. Loop while p1 is less than or equal to p2:
   - If arr[p1] is 0 and arr[p2] is 1 → it's already in the correct position, so move both pointers inward.
   - If arr[p1] is 1 and arr[p2] is 0 → swap them, since they are in the wrong position.
   - If arr[p1] is 0 and arr[p2] is 0 → p1 is fine, move it forward to check next.
   - If arr[p1] is 1 and arr[p2] is 1 → p2 is fine, move it backward to check next.
 */

public class Segregate_zeros_ones {

    public int[] segregate0and1(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 <= p2) {
            if (arr[p1] == 0 && arr[p2] == 1) {
                p1++;
                p2--;
            } else if (arr[p1] == 1 && arr[p2] == 0) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            } else if (arr[p1] == 0 && arr[p2] == 0) {
                p1++;
            } else if (arr[p1] == 1 && arr[p2] == 1) {
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
