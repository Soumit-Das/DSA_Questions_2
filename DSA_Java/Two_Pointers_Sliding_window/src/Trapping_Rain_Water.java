
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Explanation:
Water is trapped in the "valleys" between the heights. Each position traps water depending on the
maximum height to its left and right.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

-----------------------------------------------------

Intuition Behind the Problem:

For each element at index `i`, the water it can trap on top of it is determined by:
    min(maxLeft[i], maxRight[i]) - height[i]

Where:
- maxLeft[i] = highest bar on the left of index `i` (including itself)
- maxRight[i] = highest bar on the right of index `i` (including itself)

This is because:
- Water cannot rise above the shortest of the two walls (left and right).
- If the current bar is taller or equal to either of those, then it can’t trap any water at that index.

-----------------------------------------------------

Optimized Two-Pointer Approach (O(n) Time and O(1) Space):

Idea:
- Instead of calculating maxLeft and maxRight arrays, use two pointers (left and right)
  and track the running maxLeft and maxRight as you go.
- Always move the side which has the smaller max height, because that determines the water level.

Steps:
1. Initialize two pointers: `l` = 0, `r` = height.length - 1
2. Initialize `lMax` = 0 and `rMax` = 0 (to keep track of max height on left and right)
3. While `l < r`, do:
   - If `height[l] <= height[r]`:
     - If `lMax > height[l]`, we can trap water: `lMax - height[l]`
     - Else, update `lMax = height[l]`
     - Move `l++`
   - Else:
     - If `rMax > height[r]`, we can trap water: `rMax - height[r]`
     - Else, update `rMax = height[r]`
     - Move `r--`

This way, you only traverse the array once and calculate the total trapped water.

-----------------------------------------------------

**Time Complexity: O(n)
**Space Complexity: O(1)
 */

public class Trapping_Rain_Water {

    public int trap(int[] height) {
        int lMax = 0;
        int rMax = 0;
        int total = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            if(height[l] <= height[r]){
                if(lMax > height[l]){
                    total += lMax - height[l];
                    l++;
                }
                else{
                    lMax = height[l];
                    l++;
                }
            }
            else{
                if(rMax > height[r]){
                    total += rMax - height[r];
                    r--;
                }else{
                    rMax = height[r];
                    r--;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water trappingRainWater = new Trapping_Rain_Water();
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater.trap(arr));
    }
}
