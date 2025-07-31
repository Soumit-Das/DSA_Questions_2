
/*

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

Approach
This is the Dutch National Flag algorithm. It sorts the array in one pass using three pointers: `i`, `k`, and `j`.

Step-by-step explanation:
1. `i` points to the position where the next 0 should go (left zone).
2. `j` points to the position where the next 2 should go (right zone).
3. `k` is the current index being examined.

We loop until `k <= j`:
- If `nums[k] == 0`: It's a red → swap with `i` and move both `i` and `k` forward.
- If `nums[k] == 2`: It's a blue → swap with `j` and move only `j` backward (don't move `k` because the swapped value at `k` needs to be checked).
- If `nums[k] == 1`: It's a white → already in the middle zone → move `k` forward.

Time Complexity: O(n) — each element is checked at most once.
Space Complexity: O(1) — in-place sorting with no extra memory.

 */


public class Sort_Colours {
    public int[] sortArrColors(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int k = 0;

        while(k <= j && i < j){
            if(nums[k] == 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
                k++;
            }
            else if(nums[k] == 2){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
            }
            else if(nums[k] == 1){
                k++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Sort_Colours sortColours = new Sort_Colours();
        int[] arr = {2,0,2,1,1,0};
        for(int n : sortColours.sortArrColors(arr)){
            System.out.println(n);
        }
    }

}
