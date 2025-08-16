
/*

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.



Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true

Approach
We need to check if `n` can be reduced to 1 by repeatedly dividing it by 4.
- Base case 1: If n == 1 → return true (since 4^0 = 1).
- Base case 2: If n <= 0 → return false (negative numbers and zero are not powers of 4).
- Recursive step: Check if n is divisible by 4.
  If yes → recursively check for n/4, otherwise return false.

Recursion Tracing for n = 16
-----------------------------
isPowerOfFour(16)
 → 16 % 4 == 0 → true → call isPowerOfFour(16/4 = 4)

   isPowerOfFour(4)
   → 4 % 4 == 0 → true → call isPowerOfFour(4/4 = 1)

      isPowerOfFour(1)
      → n == 1 → return true

Final result bubbles back:
true ← isPowerOfFour(1)
true ← isPowerOfFour(4)
true ← isPowerOfFour(16)
So, answer = true

 */

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        if(n <= 0){
            return false;
        }
        return n % 4 == 0 && isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
