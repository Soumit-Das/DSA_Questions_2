
/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false


Approach

We need to check if `n` can be reduced to 1 by repeatedly dividing it by 2.
- Base case 1: If n == 1 → return true (since 2^0 = 1).
- Base case 2: If n == 0 → return false (zero is not a power of 2).
- Recursive step: Check if n is divisible by 2.
  If yes → recursively check for n/2, otherwise return false.

Recursion Tracing for n = 16
-----------------------------
isPowerOfTwo(16)
 → 16 % 2 == 0 → true → call isPowerOfTwo(16/2 = 8)

   isPowerOfTwo(8)
   → 8 % 2 == 0 → true → call isPowerOfTwo(8/2 = 4)

      isPowerOfTwo(4)
      → 4 % 2 == 0 → true → call isPowerOfTwo(4/2 = 2)

         isPowerOfTwo(2)
         → 2 % 2 == 0 → true → call isPowerOfTwo(2/2 = 1)

            isPowerOfTwo(1)
            → n == 1 → return true

Final result bubbles back:
true ← isPowerOfTwo(1)
true ← isPowerOfTwo(2)
true ← isPowerOfTwo(4)
true ← isPowerOfTwo(8)
true ← isPowerOfTwo(16)
So, answer = true


 */

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n == 0){
            return false;
        }
        return n % 2 == 0 && isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
