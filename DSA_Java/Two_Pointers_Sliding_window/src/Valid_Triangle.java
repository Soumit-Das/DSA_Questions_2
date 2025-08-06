import java.util.Arrays;

/*

Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are:
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

Example 2:

Input: nums = [4,2,3,4]
Output: 4

Approach

- Triangle Formation Rule:
  To form a valid triangle with three sides `a`, `b`, and `c`, the sum of the lengths of
  any two sides must be **greater than the third side**. That is:

    a + b > c
    a + c > b
    b + c > a

  But if we **sort the array in ascending order**, we can simplify this:
  For a valid triangle with sides (a ≤ b ≤ c), we only need to check:

    a + b > c

  Because sorting ensures that:
    - a ≤ b ≤ c
    - So, a + c > b and b + c > a will always be true if a + b > c is true.

- **Optimized Two-Pointer Solution**:
  1. Sort the array first.
  2. Iterate from the end (treating each number as the longest side `c`).
  3. Use two pointers (`j = 0`, `k = i - 1`) to find all pairs (a, b) such that:

     nums[j] + nums[k] > nums[i]

     - If the sum is valid: then all pairs from j to k with nums[k] will also be valid,
       because increasing j will only increase the sum. So, we add (k - j) to the count.
       Then we move k backward.
     - If the sum is not valid: move j forward to try a larger `a`.

- Time Complexity: O(n²)
- Space Complexity: O(1) (ignoring sorting space)

This is the most optimal approach known for this problem.


 */


public class Valid_Triangle {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = nums.length - 1; i >= 2; i--){
            int j = 0;
            int k = i - 1;
            while(j < k){
                if(nums[j] + nums[k] > nums[i]){
                    count+= k - j;
                    k--;
                }else{
                    j++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Valid_Triangle validTriangle = new Valid_Triangle();
        int[] nums = {4,2,3,4};
        System.out.println(validTriangle.triangleNumber(nums));

    }
}
