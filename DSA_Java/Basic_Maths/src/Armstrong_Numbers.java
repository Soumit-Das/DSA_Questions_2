/*
You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself.
371 is an Armstrong number since 33 + 73 + 13 = 371.

Note: Return "true" if it is an Armstrong number else return "false".

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. Hence answer is "false".
 */


public class Armstrong_Numbers {
    public static String armstrongNumber(int n) {
        int res = 0;
        int last;
        int num = n;
        while (n != 0) {
            last = n % 10;
            res += last * last * last;
            n = n / 10;
        }
        if (num == res) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(372));
        System.out.println((int) Math.sqrt(4));
    }

}
