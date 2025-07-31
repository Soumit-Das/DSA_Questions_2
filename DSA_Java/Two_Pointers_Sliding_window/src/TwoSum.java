import java.util.Arrays;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Approach

This approach solves the problem using sorting and the two-pointer technique.

Step-by-step explanation:
1. Clone the original array into `sortedArr` so that we can sort it without modifying the original indices.
2. Sort `sortedArr` in ascending order.
3. Initialize two pointers:
   - `i` starting at the beginning (left side)
   - `j` starting at the end (right side)
4. While `i < j`, calculate the sum of `sortedArr[i] + sortedArr[j]`:
   - If the sum is less than the target, move `i` forward to increase the sum.
   - If the sum is greater than the target, move `j` backward to decrease the sum.
   - If the sum equals the target, break the loop. The values at `i` and `j` are the two numbers we need.
5. After finding the correct pair in the sorted array, we now need their **original indices** in the input array `nums`.
   - Use `firstOccurrence()` to find the first index of the first number.
   - Use `lastOccurrence()` to find the last index of the second number (handles duplicates correctly).
6. Return the indices as the answer.

Time Complexity: O(n log n) due to sorting.
Space Complexity: O(n) due to cloning the array.

Note: This is not the most optimized solution for Two Sum. A better approach uses HashMap in O(n) time and O(n) space, but this is a valid and working alternative.


 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        int i = 0;
        int j = nums.length-1;
        int[] ans = new int[2];

        while(i < j){
            int sum = sortedArr[i] + sortedArr[j];
            ans[0] = i;
            ans[1] = j;
            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                break;
            }
        }
        int f = firstOccurrence(nums, sortedArr[ans[0]]);
        int l = lastOccurrence(nums, sortedArr[ans[1]]);
        ans[0] = f;
        ans[1] = l;
        return ans;
    }

    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TwoSum closeSum = new TwoSum();
        int[] arr = {0,3,-3,4,-1};
        int[] closet = closeSum.twoSum(arr, -1);
        for(int n : closet){
            System.out.println(n);
        }
    }

}
