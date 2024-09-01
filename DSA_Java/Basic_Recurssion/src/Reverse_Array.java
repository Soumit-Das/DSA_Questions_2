import java.util.Arrays;

/*

Problem Statement: You are given an array. The task is to reverse the array and print it.

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.

 */

public class Reverse_Array {
    public static void reverse(int i, int[] arr, int n){
       if(i >= n/2){
           return;
       }
       int temp = arr[i];
       arr[i] = arr[n - i - 1];
       arr[n - i - 1] = temp;
       reverse(i+1, arr, n);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(0, arr, arr.length);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
