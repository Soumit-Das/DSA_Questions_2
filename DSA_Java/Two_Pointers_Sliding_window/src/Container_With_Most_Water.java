
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Approach
- We use the **two-pointer approach** to solve this in O(n) time.
- Start with two pointers: one at the beginning (i = 0) and one at the end (j = n - 1).
- At each step, calculate the area between these two lines:
    Area = (j - i) * min(height[i], height[j])
- Update the maximum area seen so far.
- Move the pointer which is at the **shorter line** — because moving the longer one won’t help increase area.


 */

public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int area = (j - i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, area);
            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Container_With_Most_Water c = new Container_With_Most_Water();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(c.maxArea(heights));
    }
}
