
/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104

Approach
We use the **Sliding Window** technique to efficiently find the smallest subarray that satisfies the condition.

Step-by-step explanation:
1. Use two pointers `st` and `e` to represent the current window [st...e)
2. Expand the window by moving `e` to the right and adding nums[e] to `curr` (current sum)
3. As soon as the sum becomes >= target, we try to shrink the window from the left (`st`) to find the smallest size
4. Update the answer whenever we find a valid window
5. If no valid subarray is found, return 0

 */

public class Smallest_SubArray_Sum {

    public int minSubArrayLen(int target, int[] nums) {
        int st = 0;
        int e = 0;
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        while(e < nums.length){
            curr += nums[e];
            e++;
            while(st < e && curr >= target){
                ans = Math.min(ans, e - st + 1);
                curr = curr - nums[st];
                st++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans - 1;
    }

    public static void main(String[] args) {
        Smallest_SubArray_Sum smallestSubArraySum = new Smallest_SubArray_Sum();
        int target = 7;
        int[] arr = {2,3,1,2,4,3};
        int subArrLen = smallestSubArraySum.minSubArrayLen(target, arr);
        System.out.println(subArrLen);
    }

}
